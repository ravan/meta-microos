SUMMARY = "Development Tools for Programs which will use the libtiff Library"
DESCRIPTION = "This package contains the header files and static libraries for \
developing programs which will manipulate TIFF format image files using \
the libtiff library."
LICENSE = "HPND"

PV = "4.7.2"

RPM_NAME = "libtiff-devel-4.7.2-1.2.aarch64.rpm"
RPM_HASH = "496b0cbeee137e5873193c93c5d261ffe28711bbd81b8252b912c6145bfeef9bed19dd4e04d5423fd8facad5da8a9cd6374d0659dd3279cae05dfd0c4def4922"

RPROVIDES:${PN} += "cmake-tiff \
libtiff-devel \
pkgconfig-libtiff-4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libstdc++-devel \
libtiff6 \
pkgconfig-Lerc \
pkgconfig-libjpeg \
pkgconfig-liblzma \
pkgconfig-libzstd \
pkgconfig-zlib"

inherit rpm
