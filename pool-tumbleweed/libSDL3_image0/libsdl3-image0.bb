SUMMARY = "Simple DirectMedia Layer image loading library"
DESCRIPTION = "This is a library to load images of various formats as SDL \
surfaces. This library supports the BMP, PPM, PCX, GIF, JPEG, PNG, \
TIFF and WEBP formats."
LICENSE = "Zlib"

PV = "3.4.6"

RPM_NAME = "libSDL3_image0-3.4.6-1.1.aarch64.rpm"
RPM_HASH = "f445f27ddbd40f2f94c542bc606aed6c72f485a936fa6cf3061d5c22b3364290ab206413be7323a8b4e548b76312de16a7f8fc890ddd4e12804876af93b0184c"

RPROVIDES:${PN} += "SDL2-image \
libSDL3-image.so.0 \
libSDL3-image0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSDL3.so.0 \
libc.so.6"

inherit rpm
