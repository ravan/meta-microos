SUMMARY = "Tool for adding locations to the user PATH"
DESCRIPTION = "Cross-platform tool for adding locations to the user PATH, \
with no elevated privileges required."
LICENSE = "MIT"

PV = "1.9.2"

RPM_NAME = "python314-userpath-1.9.2-4.7.noarch.rpm"
RPM_HASH = "8b061b69d599f5d6519be290bfecaa0f5b1f4b7924574d1474d140eea455ae60b017f83bffd5b2f37f2f7e55d3b671d652a862529c8f771d37f5ecefffed2af8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-userpath \
python314-userpath \
python3dist-userpath"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-click"

inherit rpm
