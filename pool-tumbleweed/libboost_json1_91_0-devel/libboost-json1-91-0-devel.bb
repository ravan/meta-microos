SUMMARY = "Development headers for Boost.JSON library"
DESCRIPTION = "This package contains development headers for Boost.JSON library."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_json1_91_0-devel-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "65d0a54f36ad9f6d15b5ca7b601ad64c5bbbaf2f50bd58935ee990b702d7c4a5e25c071ffb84874494268c3c39b286ee514c8ac7e3d3c9651d199159ce0bc605"

RPROVIDES:${PN} += "libboost-json-devel-impl \
libboost-json1-91-0-devel"

RDEPENDS:${PN} += "libboost-container1-91-0-devel \
libboost-json1-91-0"

inherit rpm
