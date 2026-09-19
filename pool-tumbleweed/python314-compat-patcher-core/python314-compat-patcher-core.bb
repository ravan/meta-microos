SUMMARY = "Python patcher system"
DESCRIPTION = "Python patcher system to allow easy and lasting API compatibility."
LICENSE = "MIT"

PV = "2.3"

RPM_NAME = "python314-compat-patcher-core-2.3-1.5.noarch.rpm"
RPM_HASH = "157adcbb36c99b7d01fab4838da066aad4580efb850e84ba54d6f5d83fb24ea46c57e916c7e1b2b4363da4ae7ecbd5f55b24a9618e0588a53f7647a9d571fc50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-compat-patcher-core \
python314-compat-patcher-core \
python3dist-compat-patcher-core"

RDEPENDS:${PN} += "python-abi"

inherit rpm
