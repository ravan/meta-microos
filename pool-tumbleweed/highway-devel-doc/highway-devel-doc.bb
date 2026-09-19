SUMMARY = "Documentation for Highway"
DESCRIPTION = "Highway is a C++ library that provides portable SIMD/vector intrinsics. \
 \
Documentation for Highway development."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "1.4.0"

RPM_NAME = "highway-devel-doc-1.4.0-2.1.noarch.rpm"
RPM_HASH = "e1a0a56736d9e1804d25a1e5f2bfdb39aa94da65848927694584d0f89224e06f695ae450bcfaf09f6e3a714444c6543cfbb24c47ffcdaad38caf3a3e8a3b520e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "highway-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
