SUMMARY = "Library for image processing and image analysis applications"
DESCRIPTION = "Library for efficient image processing and image analysis operations."
LICENSE = "BSD-2-Clause"

PV = "1.87.0"

RPM_NAME = "libleptonica6-1.87.0-1.5.aarch64.rpm"
RPM_HASH = "7240bd885cb09509675418fa27c5c21c3d1f1092bbf9c8a6c537e23563c0cae9c8782cc728cd7e8091f5687854e6ca18d85934756ed4efc62b2d90e969fabd5d"

RPROVIDES:${PN} += "liblept \
libleptonica.so.6 \
libleptonica6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgif.so.7 \
libjpeg.so.8 \
libm.so.6 \
libopenjp2.so.7 \
libpng16.so.16 \
libtiff.so.6 \
libwebp.so.7 \
libwebpmux.so.3 \
libz.so.1"

inherit rpm
