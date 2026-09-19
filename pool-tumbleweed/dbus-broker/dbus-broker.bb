SUMMARY = "XDG message bus implementation"
DESCRIPTION = "dbus-broker is an implementation of a message bus as defined by the \
D-Bus specification. It has some different characteristics/features \
from classic D-Bus: \
 \
* No shared medium \
* No IPC to implement IPC \
* User-based accounting \
* Reliable messages \
* Just the bus implementation, no external communication \
* Local only, no remote transport \
* Support for SASL pipelining \
* Runtime broker control"
LICENSE = "Apache-2.0"

PV = "37"

RPM_NAME = "dbus-broker-37-2.4.aarch64.rpm"
RPM_HASH = "7737206e98704ed97804504b84373bb9577baa0c7d8e576100768fc06152ddced9183a6afc0593ff228ab56c6997ceac717e58dd9ded0c74c462de8e5d66800a"

RPROVIDES:${PN} += "bundled-c-dvar \
bundled-c-ini \
bundled-c-list \
bundled-c-rbtree \
bundled-c-shquote \
bundled-c-stdaux \
bundled-c-utf8 \
dbus-broker \
dbus-service"

RDEPENDS:${PN} += "/usr/bin/sh \
dbus-1-common \
dbus-broker-restart-behavior \
ld-linux-aarch64.so.1 \
libaudit.so.1 \
libc.so.6 \
libcap-ng.so.0 \
libexpat.so.1 \
libm.so.6 \
libselinux.so.1 \
libsystemd.so.0 \
systemd"

inherit rpm
