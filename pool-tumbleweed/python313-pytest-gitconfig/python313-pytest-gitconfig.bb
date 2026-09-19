SUMMARY = "Provide a Git config sandbox for testing"
DESCRIPTION = "Provide a Git config sandbox for testing"
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python313-pytest-gitconfig-0.9.0-1.2.noarch.rpm"
RPM_HASH = "04d7a11e0a6a0c60036f16a8d8f53c75a71a776309ce6c6b32e44bda6cd0d7b815fe886d7fd704683b66b0e9a48c63d4d2f05d68bc7e71f2f8850db214b3faf0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-gitconfig \
python3.13dist-pytest-gitconfig \
python313-pytest-gitconfig \
python3dist-pytest-gitconfig"

RDEPENDS:${PN} += "python-abi \
python313-pytest"

inherit rpm
