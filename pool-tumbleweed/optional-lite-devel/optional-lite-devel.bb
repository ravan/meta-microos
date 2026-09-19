SUMMARY = "A single-file header-only version of a C++17-like optional"
DESCRIPTION = "Development files for a header-only library \
of a C++17-like optional, a nullable object for C++98, C++11 and later."
LICENSE = "BSL-1.0"

PV = "3.6.0"

RPM_NAME = "optional-lite-devel-3.6.0-1.9.aarch64.rpm"
RPM_HASH = "c97877c22a4e1a742a008b66d6056755cca008e5c8df0192c48a1dff68b4f216da77a24758e2a17af32aff9190229d3986a70eed0a7adde30fec73a5e08976bc"

RPROVIDES:${PN} += "cmake-optional-lite \
optional-lite-devel"

RDEPENDS:${PN} += "libstdc++-devel"

inherit rpm
