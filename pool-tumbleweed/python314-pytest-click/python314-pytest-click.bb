SUMMARY = "Pytest plugin for Click"
DESCRIPTION = "Py.test plugin for Click."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python314-pytest-click-1.1.0-3.5.noarch.rpm"
RPM_HASH = "937874fee7f8e6baab15d80bd6a44ced5d38a6012461195722b2c9016d1b3e73077880d2f7c926c6a01576610e2a7c258480355844d052d692b8ec58970a51a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-click \
python314-pytest-click \
python3dist-pytest-click"

RDEPENDS:${PN} += "python-abi \
python314-click \
python314-pytest"

inherit rpm
