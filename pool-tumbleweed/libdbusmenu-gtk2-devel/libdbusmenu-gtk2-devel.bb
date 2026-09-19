SUMMARY = "Development files for libdbusmenu-gtk4"
DESCRIPTION = "This package contains the development files for the dbusmenu-gtk2 library."
LICENSE = "GPL-3.0-only & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "16.04.0"

RPM_NAME = "libdbusmenu-gtk2-devel-16.04.0-13.4.aarch64.rpm"
RPM_HASH = "c58d9770b380dd5ed4d2c0411d2b3ee4b9b1c3cb8e536fe7e3419218a36ef4c32b471dbbd948eda07d16b0c32cd5b7bdd611ba311a9921546813cb674f9447d3"

RPROVIDES:${PN} += "libdbusmenu-gtk2-devel \
pkgconfig-dbusmenu-gtk-0.4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdbusmenu-gtk4 \
pkgconfig-dbus-glib-1 \
pkgconfig-dbusmenu-glib-0.4 \
pkgconfig-gdk-pixbuf-2.0 \
pkgconfig-gtk+-2.0 \
typelib-1-0-DbusmenuGtk-0-4"

inherit rpm
