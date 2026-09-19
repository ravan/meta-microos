SUMMARY = "Generate test data from JSON schemata with Hypothesis"
DESCRIPTION = "Generate test data from JSON schemata with Hypothesis"
LICENSE = "MPL-2.0"

PV = "0.23.1+gitfa38b03"

RPM_NAME = "python314-hypothesis-jsonschema-0.23.1+gitfa38b03-1.2.noarch.rpm"
RPM_HASH = "05742d48b0074507349c0afa842bb17a7137ec93d9132c097596777c572a54e76d2af37c027b34ce46a4e99555f565a9eef2a1229783ffcf873a6949477b6a77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-hypothesis-jsonschema \
python314-hypothesis-jsonschema \
python3dist-hypothesis-jsonschema"

RDEPENDS:${PN} += "python-abi \
python314-hypothesis \
python314-jsonschema"

inherit rpm
