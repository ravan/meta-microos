SUMMARY = "Testing support by jaraco"
DESCRIPTION = "Testing support by jaraco"
LICENSE = "MIT"

PV = "5.7.0"

RPM_NAME = "python313-jaraco.test-5.7.0-1.1.noarch.rpm"
RPM_HASH = "9b4a70556e020bd1f00940d9b897842cdcbdb100e6181ff76f45ffb83b56a037a6d67f315461137e0cbdf7eb0324d0f6c8df9bfa165dff47c54deff5af1283d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jaraco.test \
python3.13dist-jaraco.test \
python313-jaraco.test \
python3dist-jaraco.test"

RDEPENDS:${PN} += "git-core \
python-abi \
python313-jaraco.collections \
python313-jaraco.context \
python313-jaraco.functools"

inherit rpm
