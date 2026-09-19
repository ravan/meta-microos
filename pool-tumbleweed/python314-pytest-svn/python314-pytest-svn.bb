SUMMARY = "SVN repository fixture for pytest"
DESCRIPTION = "SVN repository fixture for py.test."
LICENSE = "MIT"

PV = "1.8.0"

RPM_NAME = "python314-pytest-svn-1.8.0-1.8.noarch.rpm"
RPM_HASH = "9729ffed88125e6bf4870dc9383a67515bf1867325b8e224c595352c6c1ea22240d4a8e6a97cbb72bcfd7212171ceacb7d504927b1d07a71865da7abd4443723"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-svn \
python314-pytest-svn \
python3dist-pytest-svn"

RDEPENDS:${PN} += "python-abi \
python314-pytest \
python314-pytest-shutil \
subversion"

inherit rpm
