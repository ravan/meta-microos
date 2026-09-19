SUMMARY = "Development headers for Boost.URL library"
DESCRIPTION = "This package contains development headers for Boost.URL library."
LICENSE = "MIT"

PV = "1.91.0"

RPM_NAME = "libboost_url-devel-1.91.0-2.1.aarch64.rpm"
RPM_HASH = "1ac0018faf4476825ca7a6e08b7ad588c16e0bcaa3ed39e51a6e0ab016155e84fac87f0884c7393de6a0da392a4c3c59f765db0f873f74a6f8fa7fa8c63d95dc"

RPROVIDES:${PN} += "libboost-url-devel"

RDEPENDS:${PN} += "libboost-url1-91-0-devel"

inherit rpm
