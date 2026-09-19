SUMMARY = "Simple DirectMedia Layer 2 image loading library"
DESCRIPTION = "This is a library to load images of various formats as SDL \
surfaces. This library supports the BMP, PPM, PCX, GIF, JPEG, PNG, \
TIFF and WEBP formats."
LICENSE = "Zlib"

PV = "2.8.12"

RPM_NAME = "libSDL2_image-2_0-0-2.8.12-1.2.aarch64.rpm"
RPM_HASH = "35ac676fae513dd3955294e2f689dc2e928901fd46f72b84b0ac2942e108ea9d5e88f2161b4e1709c6e4cdd869bd61d27e02eabb2a0ece3a37e3a22b31cbc809"

RPROVIDES:${PN} += "SDL2-image \
libSDL2-image-2-0-0 \
libSDL2-image-2.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libjpeg.so.8 \
libpng16.so.16 \
libtiff.so.6 \
libwebp.so.7 \
libwebpdemux.so.2"

inherit rpm
