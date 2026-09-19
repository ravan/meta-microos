SUMMARY = "Development files for libblake3"
DESCRIPTION = "This package contains the development files (mainly C header files) for libblake3."
LICENSE = "Apache-2.0"

PV = "1.8.7"

RPM_NAME = "blake3-devel-1.8.7-1.1.aarch64.rpm"
RPM_HASH = "f0260ce374ccb58a9d83457c17d997b46b2e625474dd139e249e1d804873f0dca864c30df93bbf74fa1bafd4e4eee7fb3838182d1a71e215f5209b5014c9ac1e"

RPROVIDES:${PN} += "blake3-devel \
cmake-blake3 \
libblake3-devel \
pkgconfig-libblake3"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libblake3-0 \
pkgconfig-tbb"

inherit rpm
