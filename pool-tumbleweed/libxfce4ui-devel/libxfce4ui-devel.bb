SUMMARY = "Development Files for the libxfce4ui Library"
DESCRIPTION = "This package provides development files for developing applications based on \
the libxfce4ui library."
LICENSE = "LGPL-2.1-or-later"

PV = "4.20.2"

RPM_NAME = "libxfce4ui-devel-4.20.2-1.5.aarch64.rpm"
RPM_HASH = "733de6c17d2f69bd25590ca642b959239171ba86187f7402e00796ee6336e7334ba0bf8e2bfc32a9bdd3f74f1e5169d806253061352359a3ff2637a0b7e4067b"

RPROVIDES:${PN} += "libxfce4ui-devel \
libxfce4uiglade2.so \
pkgconfig-libxfce4kbd-private-3 \
pkgconfig-libxfce4ui-2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libc.so.6 \
libgladeui-2.so.13 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libxfce4kbd-private-3-0 \
libxfce4ui-2-0 \
libxfce4ui-2.so.0 \
pkgconfig-gdk-3.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-libxfce4ui-2 \
pkgconfig-libxfce4util-1.0 \
pkgconfig-libxfconf-0"

inherit rpm
