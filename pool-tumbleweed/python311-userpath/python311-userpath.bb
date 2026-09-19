SUMMARY = "Tool for adding locations to the user PATH"
DESCRIPTION = "Cross-platform tool for adding locations to the user PATH, \
with no elevated privileges required."
LICENSE = "MIT"

PV = "1.9.2"

RPM_NAME = "python311-userpath-1.9.2-4.7.noarch.rpm"
RPM_HASH = "f3d0cebe39ece9ae8b3bcaddb75cd82e9007ebcb84db7b624a9ab7aadfb92e44d1c98c2c2c6bb9b5907a5bf5fef1c071ada727144430efb31ad550917817ae0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-userpath \
python311-userpath \
python3dist-userpath"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
alts \
python-abi \
python311-click"

inherit rpm
