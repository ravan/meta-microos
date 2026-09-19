SUMMARY = "Development for libjxl, an en-/decoder for JPEG XL"
DESCRIPTION = "JPEG XL is a raster-graphics file format that supports both lossy and \
lossless compression. \
 \
This is the reference implementation of JPEG XL, with encoder and decoder."
LICENSE = "BSD-3-Clause"

PV = "0.11.2"

RPM_NAME = "libjxl-devel-0.11.2-2.3.aarch64.rpm"
RPM_HASH = "2a123f7ffb27abb2b242eb5f0500133342ac59572aff07794d1c8e5f384677b009a65f94e199742afcc27214465f7b2c31fef8e99f88f6b02f9be30dc4bc39fe"

RPROVIDES:${PN} += "libjxl-devel \
pkgconfig-libjxl \
pkgconfig-libjxl-cms \
pkgconfig-libjxl-threads"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libjxl0-11 \
pkgconfig-libbrotlidec \
pkgconfig-libbrotlienc \
pkgconfig-libhwy \
pkgconfig-libjxl-cms"

inherit rpm
