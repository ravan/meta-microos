SUMMARY = "C library for reading virtual slides"
DESCRIPTION = "The OpenSlide library allows programs to access virtual slide files \
regardless of the underlying image format."
LICENSE = "LGPL-2.1-only"

PV = "4.0.1"

RPM_NAME = "libopenslide1-4.0.1-1.1.aarch64.rpm"
RPM_HASH = "cc8556ddbbb70f59483fcf58ce441d5f1976bbcb6b048519cf455b33f9ab8c08e98d6efdfe565a2c86d6e040b5a50e257af54910e59f9a0d724ae1523319b160"

RPROVIDES:${PN} += "libopenslide.so.1 \
libopenslide1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libdicom.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjpeg.so.8 \
libopenjp2.so.7 \
libpng16.so.16 \
libsqlite3.so.0 \
libtiff.so.6 \
libxml2.so.16 \
libz.so.1 \
libzstd.so.1"

inherit rpm
