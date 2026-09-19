SUMMARY = "Development files for libavif"
DESCRIPTION = "This library aims to be a friendly, portable C implementation of the AV1 Image \
File Format, as described here: \
 \
https://aomediacodec.github.io/av1-avif/ \
 \
This package holds the development files for libavif."
LICENSE = "BSD-2-Clause"

PV = "1.4.2"

RPM_NAME = "libavif-devel-1.4.2-1.4.aarch64.rpm"
RPM_HASH = "c249b06aa19f021d7b93224860ed81d961553476806923ed39963afa192b85c753231049224b69254acf0298d1fb7d7b54c57581a02973cae8121957fd874117"

RPROVIDES:${PN} += "cmake-libavif \
libavif-devel \
pkgconfig-libavif"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libavif16 \
pkgconfig-SvtAv1Enc \
pkgconfig-aom \
pkgconfig-dav1d \
pkgconfig-libsharpyuv \
pkgconfig-rav1e"

inherit rpm
