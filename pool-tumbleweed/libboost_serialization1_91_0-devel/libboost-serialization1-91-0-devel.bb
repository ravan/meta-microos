SUMMARY = "Development headers for Boost.Serialization library"
DESCRIPTION = "This package contains development headers for Boost.Serialization \
library."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_serialization1_91_0-devel-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "94a5c0a2273297e85baecdaa4506ea75f6b3405ac3483d2faf41e2ebd1d89302f51a38620cbabaeffa221b3a0a50d2380b3befe80b85705a7e5089907af3b8d5"

RPROVIDES:${PN} += "libboost-serialization-devel-impl \
libboost-serialization1-91-0-devel"

RDEPENDS:${PN} += "libboost-headers1-91-0-devel \
libboost-serialization1-91-0"

inherit rpm
