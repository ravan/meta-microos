SUMMARY = "Development files for openslide"
DESCRIPTION = "This package contains libraries and header files for \
developing applications that use openslide."
LICENSE = "LGPL-2.1-only"

PV = "4.0.1"

RPM_NAME = "libopenslide-devel-4.0.1-1.1.aarch64.rpm"
RPM_HASH = "c35690d452415f30bbdaa4cf7fe974017705456570489ad0e7d57da1f1a24b4d63cfcb16b2543abdccf6da498a6e7a4ed7e687a875c3c9075505eb24c28f47a4"

RPROVIDES:${PN} += "libopenslide-devel \
pkgconfig-openslide"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libopenslide1 \
pkgconfig-cairo \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libdicom \
pkgconfig-libjpeg \
pkgconfig-libopenjp2 \
pkgconfig-libpng \
pkgconfig-libtiff-4 \
pkgconfig-libxml-2.0 \
pkgconfig-libzstd \
pkgconfig-sqlite3 \
pkgconfig-zlib"

inherit rpm
