SUMMARY = "Extracts OS Browser etc information from http user agent string"
DESCRIPTION = "Extracts OS Browser etc information from http user agent string"
LICENSE = "MIT"

PV = "1.9.9"

RPM_NAME = "python313-httpagentparser-1.9.9-1.2.noarch.rpm"
RPM_HASH = "48d34252ec54a44b280504b67e06add8efae7f7a2879581d9af780d7976e2393442b6faf66c06f839923607f7cc2be53b7a164de02f1325c0123797dc6357cf7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-httpagentparser \
python3.13dist-httpagentparser \
python313-httpagentparser \
python3dist-httpagentparser"

RDEPENDS:${PN} += "python-abi"

inherit rpm
