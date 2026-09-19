SUMMARY = "A goodie-bag of unix shell and environment tools for pytest"
DESCRIPTION = "This library is a goodie-bag of Unix shell and environment management \
tools for automated tests."
LICENSE = "MIT"

PV = "1.8.1"

RPM_NAME = "python313-pytest-shutil-1.8.1-1.2.noarch.rpm"
RPM_HASH = "68af6ad6c1310b2b9082678a21f25cd2730150e8c13978567432d473c467d62ac9102db27a32c17426c15b56db1cbdb2a60cfff78c9f15e7364a740fbcb73f55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-shutil \
python3.13dist-pytest-shutil \
python313-pytest-shutil \
python3dist-pytest-shutil"

RDEPENDS:${PN} += "python-abi \
python313-execnet \
python313-pytest \
python313-termcolor"

inherit rpm
