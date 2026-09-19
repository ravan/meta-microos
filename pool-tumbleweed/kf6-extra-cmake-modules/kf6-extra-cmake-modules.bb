SUMMARY = "CMake modules"
DESCRIPTION = "Extra modules and scripts for CMake."
LICENSE = "BSD-3-Clause"

PV = "6.30.0"

RPM_NAME = "kf6-extra-cmake-modules-6.30.0-1.1.noarch.rpm"
RPM_HASH = "f902a749751c70041c88c8e904e80d01b96483bd4f2a8c3032c17c4c4408721798bad524cd853b5f6314a57277f732285824d75b33bf5710f8e18064f14599dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "extra-cmake-modules \
kf6-extra-cmake-modules"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3 \
cmake \
gcc-c++ \
kf5-filesystem \
kf6-filesystem"

inherit rpm
