SUMMARY = "Python module for creating SVG drawings"
DESCRIPTION = "A Python library to create SVG drawings."
LICENSE = "MIT"

PV = "1.4.3"

RPM_NAME = "python313-svgwrite-1.4.3-3.5.noarch.rpm"
RPM_HASH = "6599a0cc426b3db71e987fdab5a275792267cebce1f06e3b1ac0c979febfeb6da1333f9aea3ca03633e98c37877f976318d1fb020f61cc023c8df394312defe3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-svgwrite \
python3.13dist-svgwrite \
python313-svgwrite \
python3dist-svgwrite"

RDEPENDS:${PN} += "python-abi \
python313-pyparsing"

inherit rpm
