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

RPM_NAME = "python313-numericalunits-1.26-2.2.noarch.rpm"
RPM_HASH = "a2f56f4b06a5b5442f6eb87b10411784135a02272e94f9eb55e1d3250d769d9f661b13fd0388b8f39cbf31ee338132c402f8db859d89cffdb8db28a076542b14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-numericalunits \
python3.13dist-numericalunits \
python313-numericalunits \
python3dist-numericalunits"

RDEPENDS:${PN} += "python-abi"

inherit rpm
