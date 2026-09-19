SUMMARY = "Generate test data from JSON schemata with Hypothesis"
DESCRIPTION = "Generate test data from JSON schemata with Hypothesis"
LICENSE = "MPL-2.0"

PV = "0.23.1+gitfa38b03"

RPM_NAME = "python313-hypothesis-jsonschema-0.23.1+gitfa38b03-1.2.noarch.rpm"
RPM_HASH = "0bb8cd8b0aa29aba5acdb9966b4ba0e369b8b1cd87339339ac776c75d25dbd7b210182f4497edcebee144c00a3e7e3db178b9ae2fbb6538016ef2d7480585988"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hypothesis-jsonschema \
python3.13dist-hypothesis-jsonschema \
python313-hypothesis-jsonschema \
python3dist-hypothesis-jsonschema"

RDEPENDS:${PN} += "python-abi \
python313-hypothesis \
python313-jsonschema"

inherit rpm
