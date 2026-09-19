SUMMARY = "Build backend used by Hatch"
DESCRIPTION = "This is the extensible, standards compliant build backend used by Hatch."
LICENSE = "MIT"

PV = "1.32.0"

RPM_NAME = "python311-hatchling-1.32.0-1.1.noarch.rpm"
RPM_HASH = "d0318729fe37d72a75a81eda05b3a2b140170e343631fe6a63b6e9cefc1ce0f3b68a46b546cac2f04fa230d3584fb10f52a118b5156acd4b6a406744cb1782a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-hatchling \
python311-hatchling \
python3dist-hatchling"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
alts \
python-abi \
python311-packaging \
python311-pathspec \
python311-pluggy \
python311-tomlkit \
python311-trove-classifiers"

inherit rpm
