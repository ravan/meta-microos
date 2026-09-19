SUMMARY = "Various parsers for ECMA standards"
DESCRIPTION = "A collection of parsers and helper libraries for understanding \
ECMAScript; a near feature complete fork of slimit."
LICENSE = "MIT"

PV = "1.3.4"

RPM_NAME = "python313-calmjs.parse-1.3.4-1.4.noarch.rpm"
RPM_HASH = "dd8d372937ecb4bb277a98dcda7a7beda5e99b6e87d009a27356a0bde4b31428943c2a118f88804b8f56a62ebd083f71e6508929e6650bdd606e67dcdc27f54e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-calmjs.parse \
python3.13dist-calmjs.parse \
python313-calmjs.parse \
python3dist-calmjs.parse"

RDEPENDS:${PN} += "python-abi \
python313-ply \
python313-setuptools"

inherit rpm
