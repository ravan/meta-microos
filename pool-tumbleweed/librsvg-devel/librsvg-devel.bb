SUMMARY = "Development files for librsvg, a SVG render library"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "LGPL-2.0-or-later"

PV = "2.62.3"

RPM_NAME = "librsvg-devel-2.62.3-2.2.aarch64.rpm"
RPM_HASH = "01687c83c1e52c32482137444804d332320b56062075955fa749582f50b7886895f07d06c7a545f585f03a2c3d4f55bbb8884f90217e0ea89c885ec0e52fc038"

RPROVIDES:${PN} += "librsvg-devel \
librsvg2-devel \
pkgconfig-librsvg-2.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librsvg-2-2 \
pkgconfig-cairo \
pkgconfig-cairo-gobject \
pkgconfig-cairo-png \
pkgconfig-dav1d \
pkgconfig-freetype2 \
pkgconfig-gdk-pixbuf-2.0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-harfbuzz \
pkgconfig-libxml-2.0 \
pkgconfig-pangocairo \
pkgconfig-pangoft2 \
typelib-1-0-Rsvg-2-0"

inherit rpm
