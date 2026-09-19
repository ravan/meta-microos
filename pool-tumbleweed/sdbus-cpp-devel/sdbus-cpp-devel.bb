SUMMARY = "Development files for sdbus-cpp"
DESCRIPTION = "CMake, pkg-config, headers and other development files for sdbus-cpp."
LICENSE = "LGPL-2.1-only"

PV = "2.3.1"

RPM_NAME = "sdbus-cpp-devel-2.3.1-1.3.aarch64.rpm"
RPM_HASH = "ccaef3e39e0ab388396f0fbbccdab27856fdb6481f3ce12a7a7c9e26004b0e70279a8256734d4401b49e2d1169d575aca216aaaae758abeb2e18bcacbe824f3b"

RPROVIDES:${PN} += "cmake-sdbus-c++ \
cmake-sdbus-c++-tools \
pkgconfig-sdbus-c++ \
pkgconfig-sdbus-c++-tools \
sdbus-cpp-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsdbus-c++2 \
pkgconfig-libsystemd"

inherit rpm
