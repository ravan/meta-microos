SUMMARY = "A pytest plugin that allows multiple failures per test"
DESCRIPTION = "A pytest plugin that allows multiple failures per test. A rewrite of pytest-expect"
LICENSE = "MIT"

PV = "2.8.0"

RPM_NAME = "python314-pytest-check-2.8.0-1.3.noarch.rpm"
RPM_HASH = "054d8d71fca1fbb4455b1d16bbf5447b113a8f51cd9c58ecd643efc7551b77081ba6d7e75268bba206f02e1004f3fa56abf39fd60d7330d00a4873fb1b2b0d48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-check \
python314-pytest-check \
python3dist-pytest-check"

RDEPENDS:${PN} += "python-abi \
python314-pytest"

inherit rpm
