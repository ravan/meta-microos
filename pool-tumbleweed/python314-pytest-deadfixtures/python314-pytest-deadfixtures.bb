SUMMARY = "A simple plugin to list unused fixtures in pytest"
DESCRIPTION = "A simple plugin to list unused fixtures in pytest"
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python314-pytest-deadfixtures-3.1.0-1.4.noarch.rpm"
RPM_HASH = "55f0042175842e10718b1f6daa78b4d2b216dfb81d0a4761dd606274e3ba336fce4016c2259f8f7ba83e3097d1013659fdbbea589adb72a626c9e73e117eebad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-deadfixtures \
python314-pytest-deadfixtures \
python3dist-pytest-deadfixtures"

RDEPENDS:${PN} += "python-abi \
python314-pytest"

inherit rpm
