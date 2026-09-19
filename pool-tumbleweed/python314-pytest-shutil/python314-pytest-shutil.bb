SUMMARY = "A goodie-bag of unix shell and environment tools for pytest"
DESCRIPTION = "This library is a goodie-bag of Unix shell and environment management \
tools for automated tests."
LICENSE = "MIT"

PV = "1.8.1"

RPM_NAME = "python314-pytest-shutil-1.8.1-1.2.noarch.rpm"
RPM_HASH = "c89e1a539fc245331e0ad833b978c7c6f8fb20f7ef75aa5c7a331fb2b61e7b460f84aa7d70a3e39cfe4e7ff377b65d4bc85ca19db4990fb67f592591ce06dd49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-shutil \
python314-pytest-shutil \
python3dist-pytest-shutil"

RDEPENDS:${PN} += "python-abi \
python314-execnet \
python314-pytest \
python314-termcolor"

inherit rpm
