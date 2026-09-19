SUMMARY = "GTK based UI support for QEMU"
DESCRIPTION = "This package contains a module for doing GTK based UI for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "11.1.1"

RPM_NAME = "qemu-ui-gtk-11.1.1-1.1.aarch64.rpm"
RPM_HASH = "5567ea0b46584cf9cf7c62b817d1c1e7d9e3738e4b2a87a597338006f03c15e00b603838fa322716cb376b5d8e5cff06bcdac02d950214d7005f40d68e7987f6"

RPROVIDES:${PN} += "qemu-ui-gtk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libepoxy.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpixman-1.so.0 \
libvte-2.91.so.0 \
qemu-ui-opengl"

inherit rpm
