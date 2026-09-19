SUMMARY = "Jack Audio Connection Kit D-Bus support"
DESCRIPTION = "This package contains the D-Bus support for JACK \
(Jack Audio ConnectionKit)."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.9.22"

RPM_NAME = "jack-dbus-1.9.22-5.5.aarch64.rpm"
RPM_HASH = "9acb39e373ede5fa02bbe9f943cda7223627b016457d7a2b4f102bf61a56b175c5fadfc93ac33ea589e6bb5afa2f1fff0c5f11c816e7a396a0773cac13955f16"

RPROVIDES:${PN} += "jack-dbus"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
jack-daemon \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libexpat.so.1 \
libjackserver.so.0"

inherit rpm
