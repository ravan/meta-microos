SUMMARY = "Development tools for the dbusmenu libraries"
DESCRIPTION = "This packages contains the development tools for the dbusmenu libraries."
LICENSE = "GPL-3.0-only & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "16.04.0"

RPM_NAME = "libdbusmenu-tools-16.04.0-13.4.aarch64.rpm"
RPM_HASH = "26899a561b3d04e83ea125cb8d4adaa129eda58265664ed4c1a67755112cc5413098e4079d6469057f43f2a203ee120595e6a0d497fe11ede8ed505c2de114c3"

RPROVIDES:${PN} += "libdbusmenu-tools"

RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libdbusmenu-glib.so.4 \
libdbusmenu-glib4 \
libgdk-x11-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libjson-glib-1.0.so.0"

inherit rpm
