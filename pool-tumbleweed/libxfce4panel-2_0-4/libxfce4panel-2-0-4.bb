SUMMARY = "Xfce Panel Shared Library"
DESCRIPTION = "This package contains GTK 3 variant of the xfce4-panel shared library."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.20.8"

RPM_NAME = "libxfce4panel-2_0-4-4.20.8-1.1.aarch64.rpm"
RPM_HASH = "f82a6520678b54eebf9381f76e2ee5c75ed28344d3a12d3d9ef26741817157437e22e57a4d99be48c743077477af42749791c2b6c7ebec3fb2b3c9308e310e60"

RPROVIDES:${PN} += "libxfce4panel-2-0-4 \
libxfce4panel-2.0.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtk-layer-shell.so.0 \
libxfce4ui-2.so.0 \
libxfce4util.so.7"

inherit rpm
