SUMMARY = "The x template library"
DESCRIPTION = "Basic tools (containers, algorithms) used by other quantstack packages."
LICENSE = "BSD-3-Clause"

PV = "0.8.2"

RPM_NAME = "xtl-devel-0.8.2-1.4.noarch.rpm"
RPM_HASH = "41f7ec30abaac78b51869aff4db4827d04e491b96554bc72fbc02e47a49cd2fee24849c2cb68a8cd6ed2aaf75d130fe305c34032e3d89f975f2c39b4bc07d1ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cmake-xtl \
pkgconfig-xtl \
xtl-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-nlohmann-json"

inherit rpm
