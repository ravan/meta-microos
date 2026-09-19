SUMMARY = "Tool for adding locations to the user PATH"
DESCRIPTION = "Cross-platform tool for adding locations to the user PATH, \
with no elevated privileges required."
LICENSE = "MIT"

PV = "1.9.2"

RPM_NAME = "python312-userpath-1.9.2-4.7.noarch.rpm"
RPM_HASH = "de1c334aeb4eff0c991d0d9d02a49a33f6d3a1422a204fd61d0fe6f09b184b0d704301af46561e30e5c7b53a09f46fc66d76cf371bbeb24e6e6754b2e1667a54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.12dist-userpath \
python312-userpath \
python3dist-userpath"

RDEPENDS:${PN} += "/usr/bin/python3.12 \
/usr/bin/sh \
alts \
python-abi \
python312-click"

inherit rpm
