SUMMARY = "Imlib 2 - image loaders"
DESCRIPTION = "This package contains the imlib2 image loaders for: argb, bmp, gif, \
jpeg, png, pnm, tga, tiff, xpm, j2k, heif, jxl."
LICENSE = "BSD-3-Clause"

PV = "1.12.7"

RPM_NAME = "imlib2-loaders-1.12.7-1.1.aarch64.rpm"
RPM_HASH = "7107039fa950b4adfb178495195c63644f8e20c8399b848851c4ce87458927ef854145145ff99b59d2562c389ec3e1b859de135b0d0d19bfa0b883e73b01671e"

RPROVIDES:${PN} += "imlib2-loader-argb \
imlib2-loader-avif \
imlib2-loader-bmp \
imlib2-loader-bz2 \
imlib2-loader-gif \
imlib2-loader-heif \
imlib2-loader-j2k \
imlib2-loader-jpeg \
imlib2-loader-jxl \
imlib2-loader-png \
imlib2-loader-pnm \
imlib2-loader-raw \
imlib2-loader-svg \
imlib2-loader-tga \
imlib2-loader-tiff \
imlib2-loader-webp \
imlib2-loader-xpm \
imlib2-loader-xz \
imlib2-loader-yuv \
imlib2-loader-zlib \
imlib2-loaders"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libavif.so.16 \
libbz2.so.1 \
libc.so.6 \
libcairo.so.2 \
libgif.so.7 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libheif.so.1 \
libid3tag.so.0 \
libjpeg.so.8 \
libjxl-threads.so.0.11 \
libjxl.so.0.11 \
liblzma.so.5 \
libopenjp2.so.7 \
libpng16.so.16 \
libraw.so.25 \
librsvg-2.so.2 \
libtiff.so.6 \
libwebpdemux.so.2 \
libyuv.so.0 \
libz.so.1"

inherit rpm
