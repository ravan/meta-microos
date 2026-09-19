SUMMARY = "Development headers for Boost.Chrono library"
DESCRIPTION = "This package contains Boost.Chrono development headers."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_chrono1_91_0-devel-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "c1a9448645dd364d7f69ed449c6ab4e9d82329b0a46fd6d4c012e3c35ba416e68d95bc3a605a5405d06a463f1f7dba27c43bf1348a7af68b2afb453417206e7c"

RPROVIDES:${PN} += "libboost-chrono-devel-impl \
libboost-chrono1-91-0-devel"

RDEPENDS:${PN} += "libboost-chrono1-91-0 \
libboost-headers1-91-0-devel"

inherit rpm
