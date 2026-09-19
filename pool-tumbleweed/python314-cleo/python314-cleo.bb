SUMMARY = "Python module for creating testable command-line interfaces"
DESCRIPTION = "Cleo allows you to create beautiful and testable command-line interfaces."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python314-cleo-2.1.0-1.12.noarch.rpm"
RPM_HASH = "b63c9cf76a747c1fad6093e9981353394304f50a2b86df03328a5ca2ed05c10a91bfdfdb575a428c7e9c0adb9af8ec1b2a6dee199956c8ac6e1be75e9a959512"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-cleo \
python314-cleo \
python3dist-cleo"

RDEPENDS:${PN} += "python-abi \
python314-crashtest \
python314-pylev \
python314-rapidfuzz"

inherit rpm
