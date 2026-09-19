SUMMARY = "Testing support by jaraco"
DESCRIPTION = "Testing support by jaraco"
LICENSE = "MIT"

PV = "5.7.0"

RPM_NAME = "python314-jaraco.test-5.7.0-1.1.noarch.rpm"
RPM_HASH = "4f6efb849b0599eda86d47a5a6480459bb43b79d1701bbafd400a178aac0ba38fe2a3254d9874745a92e23a4f1d9218ed7ce6c7afb393fd91bd9ec39bd8f9f03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jaraco.test \
python314-jaraco.test \
python3dist-jaraco.test"

RDEPENDS:${PN} += "git-core \
python-abi \
python314-jaraco.collections \
python314-jaraco.context \
python314-jaraco.functools"

inherit rpm
