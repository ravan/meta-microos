SUMMARY = "Tool for adding locations to the user PATH"
DESCRIPTION = "Cross-platform tool for adding locations to the user PATH, \
with no elevated privileges required."
LICENSE = "MIT"

PV = "1.9.2"

RPM_NAME = "python313-userpath-1.9.2-4.7.noarch.rpm"
RPM_HASH = "4f9fde317a38f0ed0d34d62d3f6f4bb84fd1e534a77237b23eb22c276995e7ee2845a70d5bbaf6342a7449c85dcfb3d54c214a1faa7a6ca274b1bb45a3f2ab27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-userpath \
python3.13dist-userpath \
python313-userpath \
python3dist-userpath"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-click"

inherit rpm
