SUMMARY = "Have a single source of version in your code base"
DESCRIPTION = "Utility to let you have a single source of version in your code base."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python314-single-version-1.6.0-1.12.noarch.rpm"
RPM_HASH = "622e4849806bea2f73601cc70f65e5c78d5cde9c452aeb861dd479777563e08e05a24bb081114855fc4b56a333fc4c0b8f7f966eb736fb9618cea1d93d3cf011"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-single-version \
python314-single-version \
python3dist-single-version"

RDEPENDS:${PN} += "python-abi \
python314-first \
python314-importlib-metadata"

inherit rpm
