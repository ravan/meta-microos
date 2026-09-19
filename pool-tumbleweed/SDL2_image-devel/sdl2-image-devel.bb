SUMMARY = "Development files for the SDL2 image loader library"
DESCRIPTION = "This is a library to load images of various formats as SDL \
surfaces. This library supports the BMP, PPM, PCX, GIF, JPEG, PNG, \
TIFF and WEBP formats."
LICENSE = "Zlib"

PV = "2.8.12"

RPM_NAME = "SDL2_image-devel-2.8.12-1.2.aarch64.rpm"
RPM_HASH = "c61bc54a81f98606affddd91218977f02d3606967a80026f16492aafd3950f13041998bc50d500994fcd62b635b53858bf7b8245ef42725fa12db23e5a596976"

RPROVIDES:${PN} += "SDL2-image-devel \
libSDL2-image-devel \
pkgconfig-SDL2-image"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libSDL2-image-2-0-0 \
pkgconfig-libjpeg \
pkgconfig-libpng \
pkgconfig-libtiff-4 \
pkgconfig-libwebp \
pkgconfig-libwebpdemux \
pkgconfig-sdl2"

inherit rpm
