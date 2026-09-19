SUMMARY = "Header files for fixmath, a fixed-point math library"
DESCRIPTION = "fixmath is a fixed-point math operations library written in C and \
implementing the Q16.16 format. \
 \
This package contains the headers."
LICENSE = "MIT"

PV = "2022.07.20"

RPM_NAME = "fixmath-devel-2022.07.20-6.11.noarch.rpm"
RPM_HASH = "26dd891a003f377fcbc6fd8ce7cfedf43998dd50349f897ef06f0671e37a96a919ed9308989ae05e9d622656d6b226bd00fb02708012502ebb9fe57701f74efe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fixmath-devel"

RDEPENDS:${PN} += "fixmath"

inherit rpm
