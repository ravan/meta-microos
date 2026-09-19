SUMMARY = "Python patcher system"
DESCRIPTION = "Python patcher system to allow easy and lasting API compatibility."
LICENSE = "MIT"

PV = "2.3"

RPM_NAME = "python313-compat-patcher-core-2.3-1.5.noarch.rpm"
RPM_HASH = "f0836f4600da3533abd7e14b589f2cf42ea31edeae58408e41f1ebee9efc61cf1f7c43975fbcec294e1c81aa687e871e4db064fe5ace489f41a273266bb930d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-compat-patcher-core \
python3.13dist-compat-patcher-core \
python313-compat-patcher-core \
python3dist-compat-patcher-core"

RDEPENDS:${PN} += "python-abi"

inherit rpm
