SUMMARY = "Teams extension for python-openid"
DESCRIPTION = "Teams extension implementation for python-openid."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "python314-python-openid-teams-1.1-2.5.noarch.rpm"
RPM_HASH = "c00d8c2bcb3e2112dd0e6d8159e013e6c951aa2e1196783a0f617c41ecb6ef107892bb7bc7ad0c296db5d23d44030632d26e230ed674459a8645e8c6769a8c97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-openid-teams \
python314-python-openid-teams \
python3dist-python-openid-teams"

RDEPENDS:${PN} += "python-abi \
python314-python3-openid"

inherit rpm
