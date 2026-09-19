SUMMARY = "D-Bus Service for Zeroconf and Bonjour"
DESCRIPTION = "Avahi is an implementation of the DNS Service Discovery and Multicast \
DNS specifications for Zeroconf Computing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "libavahi-ui-gtk3-0-0.8-45.2.aarch64.rpm"
RPM_HASH = "a228c6f532923a1ca7c746a5ba04b1ec404b9340612ed41be0dbe0675286a2e4164e5d90a5fa8657110345112f23706191f6f4a520966a560bf5d98a1dc54307"

RPROVIDES:${PN} += "libavahi-ui-gtk3-0 \
libavahi-ui-gtk3.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libavahi-client.so.3 \
libavahi-common.so.3 \
libavahi-glib.so.1 \
libc.so.6 \
libgdbm.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
