SUMMARY = "A menu system for the Cinnamon desktop environment"
DESCRIPTION = "cinnamon-menus is an implementation of the draft 'Desktop Menu \
Specification' from freedesktop.org. This package also contains \
the Cinnamon menu layout configuration files, .directory files and \
assorted menu related utility programs, Python bindings, and a \
simple menu editor."
LICENSE = "LGPL-2.1-or-later"

PV = "6.6.0"

RPM_NAME = "libcinnamon-menu-3-0-6.6.0-1.4.aarch64.rpm"
RPM_HASH = "e31f11279d6838ce1b7dbb070f4f21fd7b232116c67b1042633173b7550fb4e1c4a20782752e2d63563c314db2f0d32d422d3361ae7b0670080b63fe07b90751"

RPROVIDES:${PN} += "cinnamon-menus \
libcinnamon-menu-3-0 \
libcinnamon-menu-3.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
