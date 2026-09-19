SUMMARY = "Devel files for stp"
DESCRIPTION = "Development files for stp library."
LICENSE = "MIT"

PV = "2.4.1"

RPM_NAME = "stp-devel-2.4.1-1.1.aarch64.rpm"
RPM_HASH = "bea1dbe5023c7c8d638b910be0ebe1fa3a815c23c77f054feccec92b0182d74ead19c6fa235f6b30a601a05cecbc3ad44d11ad5d3a531e4011510e9ac80686e1"

RPROVIDES:${PN} += "cmake-STP \
stp-devel"

RDEPENDS:${PN} += "libboost-program-options-devel \
libstp2-4 \
minisat-devel \
stp"

inherit rpm
