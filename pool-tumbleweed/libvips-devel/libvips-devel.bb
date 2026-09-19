SUMMARY = "Development files for the VIPS library"
DESCRIPTION = "This package contains the development files for developing applications that \
want to make use of the VIPS library."
LICENSE = "LGPL-2.1-only"

PV = "8.18.5"

RPM_NAME = "libvips-devel-8.18.5-1.3.aarch64.rpm"
RPM_HASH = "06c0228efce49ba50304a2e08875da4eef9cfef4ac01eafe9ca07a4b5056ff3f9e74532c4d71627908ed195d0bcfb93143f43815442d44c398b1bf8619fc79c3"

RPROVIDES:${PN} += "libvips-devel \
pkgconfig-vips \
pkgconfig-vips-cpp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvips42 \
pkgconfig \
pkgconfig-OpenEXR \
pkgconfig-cairo \
pkgconfig-cfitsio \
pkgconfig-expat \
pkgconfig-fftw3 \
pkgconfig-fontconfig \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-no-export-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-imagequant \
pkgconfig-lcms2 \
pkgconfig-libarchive \
pkgconfig-libexif \
pkgconfig-libhwy \
pkgconfig-libjpeg \
pkgconfig-libopenjp2 \
pkgconfig-libpng \
pkgconfig-libraw-r \
pkgconfig-librsvg-2.0 \
pkgconfig-libtiff-4 \
pkgconfig-libwebp \
pkgconfig-libwebpdemux \
pkgconfig-libwebpmux \
pkgconfig-matio \
pkgconfig-pangocairo \
pkgconfig-pangoft2 \
pkgconfig-vips \
pkgconfig-zlib"

inherit rpm
