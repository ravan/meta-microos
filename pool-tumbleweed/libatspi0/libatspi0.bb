SUMMARY = "Assistive Technology Service Provider Interface"
DESCRIPTION = "AT-SPI is a general interface for applications to make use of the \
accessibility toolkit. This version is based on dbus."
LICENSE = "LGPL-2.1-or-later"

PV = "2.60.6"

RPM_NAME = "libatspi0-2.60.6-1.1.aarch64.rpm"
RPM_HASH = "448075dfcdcfeffd1d9da632db8dd0e958349e8861f98d969701c248a73b12609efcef12e0026580d62b6dd29c161d728f464da34d6d0a871bb434fa16b2a8ed"

RPROVIDES:${PN} += "libatspi.so.0 \
libatspi0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXi.so.6 \
libc.so.6 \
libdbus-1.so.3 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
