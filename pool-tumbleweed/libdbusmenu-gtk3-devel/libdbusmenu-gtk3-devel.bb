SUMMARY = "Development files for libdbusmenu-gtk3-4"
DESCRIPTION = "This package contains the development files for the dbusmenu-gtk3 library."
LICENSE = "GPL-3.0-only & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "16.04.0"

RPM_NAME = "libdbusmenu-gtk3-devel-16.04.0-13.4.aarch64.rpm"
RPM_HASH = "0387a8aa7b1dc69ffc354b3526e83246c3cfa4e799956ea3cc11a9a5fac0df024ddbccbf745a894b5455e27506175aff96071f9d2e79beb3b51a73d347d877e3"

RPROVIDES:${PN} += "libdbusmenu-gtk3-devel \
pkgconfig-dbusmenu-gtk3-0.4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdbusmenu-gtk3-4 \
pkgconfig-dbus-glib-1 \
pkgconfig-dbusmenu-glib-0.4 \
pkgconfig-gdk-pixbuf-2.0 \
pkgconfig-gtk+-3.0 \
typelib-1-0-DbusmenuGtk3-0-4"

inherit rpm
