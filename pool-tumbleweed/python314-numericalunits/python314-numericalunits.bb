SUMMARY = "Python module for defining quantities with units"
DESCRIPTION = "Units and dimensional analysis compatible with everything \
 \
This package implements units and dimensional analysis in an unconventional \
way with unique advantages: \
 \
* Compatible with everything \
* Zero storage overhead \
* Zero calculation overhead"
LICENSE = "MIT"

PV = "1.26"

RPM_NAME = "python314-numericalunits-1.26-2.2.noarch.rpm"
RPM_HASH = "f2a5486e779e4747fbb884b96c5f8ea1c67275bf6f68bc794cedb76d6c1eed90492908aaec0fb4fa8bf03390a7243164ec592773cd1859275fc5d79c786cc4b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-numericalunits \
python314-numericalunits \
python3dist-numericalunits"

RDEPENDS:${PN} += "python-abi"

inherit rpm
