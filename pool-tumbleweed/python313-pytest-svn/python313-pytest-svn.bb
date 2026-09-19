SUMMARY = "SVN repository fixture for pytest"
DESCRIPTION = "SVN repository fixture for py.test."
LICENSE = "MIT"

PV = "1.8.0"

RPM_NAME = "python313-pytest-svn-1.8.0-1.8.noarch.rpm"
RPM_HASH = "fca12a81b093213dd59e7a80891691aab85072bc0af02e6fbfd6276b571ae0ded19e8e31ca800d4675c65ff094c7be53e3f38ebf62859d79c468cfcc53ba5e76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-svn \
python3.13dist-pytest-svn \
python313-pytest-svn \
python3dist-pytest-svn"

RDEPENDS:${PN} += "python-abi \
python313-pytest \
python313-pytest-shutil \
subversion"

inherit rpm
