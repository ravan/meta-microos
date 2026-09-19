SUMMARY = "Git repository fixture for pytest"
DESCRIPTION = "Git repository fixture for py.test"
LICENSE = "MIT"

PV = "1.8.0"

RPM_NAME = "python313-pytest-git-1.8.0-1.8.noarch.rpm"
RPM_HASH = "c89b364b614c09e336592c8cd2fbb5382fc6c78cfb91e4f41acd9761ad174486b68930eca67c6d084bb0f66c8d7e8c1869ee63ee11bf5387c54ef54292e16264"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-git \
python3.13dist-pytest-git \
python313-pytest-git \
python3dist-pytest-git"

RDEPENDS:${PN} += "python-abi \
python313-GitPython \
python313-pytest \
python313-pytest-shutil"

inherit rpm
