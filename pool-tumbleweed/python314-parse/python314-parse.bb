SUMMARY = "Python module for parsing strings using a 'format' syntax"
DESCRIPTION = "Parse strings using a specification based on the Python format() syntax."
LICENSE = "MIT"

PV = "1.21.1"

RPM_NAME = "python314-parse-1.21.1-1.4.noarch.rpm"
RPM_HASH = "8a6581f3fefa047bd98489732e08f82d42ebe49c5c6edf22275b2b261377acbbe28efb4e0a21edb069e52ac3aa56c055aa943231b82bc61e4a91c200ed770ef0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-parse \
python314-parse \
python3dist-parse"

RDEPENDS:${PN} += "python-abi"

inherit rpm
