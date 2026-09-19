SUMMARY = "Drawing Library for Programs with PNG and JPEG Output"
DESCRIPTION = "gd allows code to quickly draw images complete with lines, arcs, text, \
multiple colors, cut and paste from other images, and flood fills. gd \
writes out the result as a PNG or JPEG file. This is particularly \
useful in World Wide Web applications, where PNG and JPEG are two of \
the formats accepted for inline images by most browsers."
LICENSE = "MIT"

PV = "2.3.3"

RPM_NAME = "gd-devel-2.3.3-6.1.aarch64.rpm"
RPM_HASH = "75a2d6bbec053c1d44f94371ab5c8ec4f76848588994bc456caacea142a0221200aaaa5766ead471803c25810f53e89ae15f2724746ec356c243aed9e52779fb"

RPROVIDES:${PN} += "gd-devel \
pkgconfig-gdlib"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libgd3 \
pkgconfig-fontconfig \
pkgconfig-freetype2 \
pkgconfig-libavif \
pkgconfig-libjpeg \
pkgconfig-libpng \
pkgconfig-libtiff-4 \
pkgconfig-libwebp \
pkgconfig-xpm \
pkgconfig-zlib"

inherit rpm
