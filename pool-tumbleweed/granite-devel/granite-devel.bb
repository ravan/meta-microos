SUMMARY = "Development files for the Granite development library"
DESCRIPTION = "Granite is an extension of GTK+. \
 \
This package contains the development files for libgranite."
LICENSE = "LGPL-3.0-or-later"

PV = "7.8.1"

RPM_NAME = "granite-devel-7.8.1-1.3.aarch64.rpm"
RPM_HASH = "0cfc9546d4f1fc35395f6a59b9ca4fc51e46cd2dfe038e8e08ad0369d9f3d0e69d93ebad044c88e041c45c2583f8b9add63a36553cb30249ec837e558dd8d931"

RPROVIDES:${PN} += "granite-devel \
pkgconfig-granite-7"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgranite-7-7 \
pkgconfig-gee-0.8 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gtk4 \
typelib-1-0-Granite-7-0"

inherit rpm
