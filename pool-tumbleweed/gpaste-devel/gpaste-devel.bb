SUMMARY = "Development files for the gpaste clipboard history manager"
DESCRIPTION = "GPaste is a clipboard management daemon with DBus interface. \
 \
This package provides the development files for the library managing \
clipboard history."
LICENSE = "BSD-2-Clause"

PV = "50.9"

RPM_NAME = "gpaste-devel-50.9-1.1.aarch64.rpm"
RPM_HASH = "fe1977e447d119ee89a70fc2af0d3e2b54ee1f8abca740b2224bfa9450c744b2c9644252919ba743ce1db523d9077d92a9eb00ce0ea9e60c2248b7b272a61e5b"

RPROVIDES:${PN} += "gpaste-devel \
pkgconfig-gpaste-2 \
pkgconfig-gpaste-gtk-4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgpaste-2-0 \
libgpaste-gtk4-1 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gpaste-2 \
pkgconfig-gtk4 \
pkgconfig-libadwaita-1 \
typelib-1-0-GPaste-2"

inherit rpm
