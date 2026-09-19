SUMMARY = "Pytest plugin to run pycodestyle"
DESCRIPTION = "pytest plugin to run pycodestyle in python tests"
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "python314-pytest-pycodestyle-2.5.0-3.1.noarch.rpm"
RPM_HASH = "89d8dd18bbf2419baf396e9f07a70fd728117a2a6bd596071c070078ad7837228c627d2d61aa97f590923a525c19fbd54a90fbf947e8b51b576e334047654039"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-pycodestyle \
python314-pytest-codestyle \
python314-pytest-pycodestyle \
python3dist-pytest-pycodestyle"

RDEPENDS:${PN} += "python-abi \
python314-pycodestyle \
python314-pytest"

inherit rpm
