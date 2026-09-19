SUMMARY = "Development headers for Boost.CharConv library"
DESCRIPTION = "This package contains development headers for Boost.CharConv library."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_charconv1_91_0-devel-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "dbbf6fa1952e07de04a697418007f022f847fc5166b4649bff91976159667a676fc7460d310676dd07ff440cb21e791f78be83e0955e9bd4c992bf06c7d90ca3"

RPROVIDES:${PN} += "libboost-charconv-devel-impl \
libboost-charconv1-91-0-devel"

RDEPENDS:${PN} += "libboost-charconv1-91-0 \
libboost-container1-91-0-devel"

inherit rpm
