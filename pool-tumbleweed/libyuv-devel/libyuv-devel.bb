SUMMARY = "Development files for the YUV scaling and conversion library"
DESCRIPTION = "This package contains the development files \
for the YUV scaling and conversion library."
LICENSE = "BSD-3-Clause"

PV = "20230517+a377993"

RPM_NAME = "libyuv-devel-20230517+a377993-2.5.aarch64.rpm"
RPM_HASH = "b518c4fdfecfd85f94a3d6da3428a707a250942f5b3e3957984167407b8145b0e1acf0aac66c6d88d609ebb89f4dc197d52281784e9acf7d4c51782105bb52b4"

RPROVIDES:${PN} += "libyuv-devel \
pkgconfig-libyuv"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libyuv0"

inherit rpm
