SUMMARY = "Development headers for Boost.Wave library"
DESCRIPTION = "This package contains development headers for Boost.Wave library. \
 \
This package installs the default Boost version of the library."
LICENSE = "MIT"

PV = "1.91.0"

RPM_NAME = "libboost_wave-devel-1.91.0-2.1.aarch64.rpm"
RPM_HASH = "7536a33eec8fe4a2f8de6421147b8be25d4ae83454bff7b62c79c1e22148f91ddf8d0281fa70cec0ffbf746c36a762741c20b7463429c79ea78550c3dbd4b757"

RPROVIDES:${PN} += "libboost-wave-devel"

RDEPENDS:${PN} += "libboost-wave1-91-0-devel"

inherit rpm
