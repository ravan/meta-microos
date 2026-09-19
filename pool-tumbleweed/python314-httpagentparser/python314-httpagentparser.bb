SUMMARY = "Extracts OS Browser etc information from http user agent string"
DESCRIPTION = "Extracts OS Browser etc information from http user agent string"
LICENSE = "MIT"

PV = "1.9.9"

RPM_NAME = "python314-httpagentparser-1.9.9-1.2.noarch.rpm"
RPM_HASH = "aaaa5c4574f0ee517470a91f9efdd89ee123f978473b171ffc1c75b4e73e2aff65aec0e8e296009db81b5c03338f7e2a86f3437469b0e9c8eb82768a42b808ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-httpagentparser \
python314-httpagentparser \
python3dist-httpagentparser"

RDEPENDS:${PN} += "python-abi"

inherit rpm
