SUMMARY = "Development headers for Boost"
DESCRIPTION = "A collection of header-only libraries for Boost. This package \
installs the default version."
LICENSE = "MIT"

PV = "1.91.0"

RPM_NAME = "libboost_headers-devel-1.91.0-2.1.aarch64.rpm"
RPM_HASH = "a35ebc403b2128023b00c6564e923017c5785ecfc8a1237c7ff32682e6589ebc8ba78906e75797f88307c5c403a678357970ab8df5c359e39502505c1dea7a16"

RPROVIDES:${PN} += "libboost-headers-devel"

RDEPENDS:${PN} += "libboost-headers1-91-0-devel"

inherit rpm
