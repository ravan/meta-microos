SUMMARY = "Library for extraction of data and images from WebP container files"
DESCRIPTION = "The WebP Demux API enables extraction of images and extended format \
data from WebP files. This API currently supports reading of XMP/EXIF \
metadata, ICC profile and animated images."
LICENSE = "BSD-3-Clause"

PV = "1.6.0"

RPM_NAME = "libwebpdemux2-1.6.0-2.3.aarch64.rpm"
RPM_HASH = "d85707428c64412fe4f56f6b198cae31057ed93566298346fbbc9c4aa183505ee86063df39d0e4bf1b0366e0248eab8f05d3d3514d4da87c4da577a30c3651e9"

RPROVIDES:${PN} += "libwebpdemux.so.2 \
libwebpdemux2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libwebp.so.7"

inherit rpm
