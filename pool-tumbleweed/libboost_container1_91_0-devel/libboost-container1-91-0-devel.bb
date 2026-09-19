SUMMARY = "Development headers for Boost.Container"
DESCRIPTION = "Development header files and libraries for Boost.Container. \
Boost.Container library implements several well-known containers, \
including STL containers. The aim of the library is to offers advanced \
features not present in standard containers or to offer the latest \
standard draft features for compilers that don't comply with the latest \
C++ standard."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_container1_91_0-devel-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "dcf381c7b5eb33ccaecaefa176de6e85ad8031b7930fb16c0fe9b6854d0f03a0047735efe1eada7b4af88324456e090452760a7896cc4877f7e0cbbfbb525b75"

RPROVIDES:${PN} += "libboost-container-devel-impl \
libboost-container1-91-0-devel"

RDEPENDS:${PN} += "libboost-container1-91-0 \
libboost-headers1-91-0-devel \
libstdc++-devel"

inherit rpm
