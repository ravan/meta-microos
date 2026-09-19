SUMMARY = "Development files for the SDL3 image loader library"
DESCRIPTION = "This is a library to load images of various formats as SDL \
surfaces. This library supports the BMP, PPM, PCX, GIF, JPEG, PNG, \
TIFF and WEBP formats."
LICENSE = "Zlib"

PV = "3.4.6"

RPM_NAME = "SDL3_image-devel-3.4.6-1.1.aarch64.rpm"
RPM_HASH = "f9e44d9c03ed55a1ffa46f0b185e79433e90c5eb863557b252043d7786f11edd29cb756161fc11df3ba3c28632c071c989076352553a865c1d419ea454bd7a35"

RPROVIDES:${PN} += "SDL3-image-devel \
cmake-SDL3-image \
pkgconfig-sdl3-image"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libSDL3-image0 \
pkgconfig-sdl3"

inherit rpm
