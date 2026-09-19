SUMMARY = "Teams extension for python-openid"
DESCRIPTION = "Teams extension implementation for python-openid."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "python313-python-openid-teams-1.1-2.5.noarch.rpm"
RPM_HASH = "02758e5b03c91b60ea9b84e47add61bba4e307b49a457d2c1392ca9cf54bbc29afd977e1aa4194403e17e3aa36522af04409b9e7b49bf7ee33fd7de3e69f438e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-openid-teams \
python3.13dist-python-openid-teams \
python313-python-openid-teams \
python3dist-python-openid-teams"

RDEPENDS:${PN} += "python-abi \
python313-python3-openid"

inherit rpm
