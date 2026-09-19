SUMMARY = "Simple DirectMedia Layer – Image loading library"
DESCRIPTION = "This is a simple library to load images of various formats as SDL \
surfaces. This library supports the BMP, PPM, PCX, GIF, JPEG, PNG, \
TIFF and WEBP formats."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.12+hg695"

RPM_NAME = "libSDL_image-1_2-0-1.2.12+hg695-1.26.aarch64.rpm"
RPM_HASH = "a242cfc19c203c8fbb56e05be2f97254ea14c03cb9424194140478dd408fdc5b264b77d8841dfe9c38e047d99fb9dc902522a7c58c4dfb5125d0c5fd13a0b030"

RPROVIDES:${PN} += "SDL-image \
libSDL-image-1-2-0 \
libSDL-image-1.2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libc.so.6 \
libjpeg.so.8 \
libpng16.so.16 \
libtiff.so.6 \
libwebp.so.7"

inherit rpm
