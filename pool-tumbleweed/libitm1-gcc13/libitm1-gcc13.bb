SUMMARY = "The GNU Compiler Transactional Memory Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fgnu-tm option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "13.5.0+git10516"

RPM_NAME = "libitm1-gcc13-13.5.0+git10516-1.1.aarch64.rpm"
RPM_HASH = "2e93e9d96553d65d95e2cf216ae5680c84a96134a25e80ca854dfeb331903f2c7c0ad2935d522c89a768080e6bbaf87480bffc2d5c2717aace86449ebd609482"

RPROVIDES:${PN} += "libitm.so.1 \
libitm1 \
libitm1-gcc13"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
