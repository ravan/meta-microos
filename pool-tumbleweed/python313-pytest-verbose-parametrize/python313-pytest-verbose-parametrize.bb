SUMMARY = "More descriptive output for parametrized pytest tests"
DESCRIPTION = "More descriptive output for parametrized pytest tests."
LICENSE = "MIT"

PV = "1.8.1"

RPM_NAME = "python313-pytest-verbose-parametrize-1.8.1-1.7.noarch.rpm"
RPM_HASH = "f445666ab5bbafaa47792843f4541105fd4177d471eb456913f25519f6b54215fb603c5364b3b50ed31c7dc9b5560c5cddb9075398389ec46d5d2f1f65dc5de0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-verbose-parametrize \
python3.13dist-pytest-verbose-parametrize \
python313-pytest-verbose-parametrize \
python3dist-pytest-verbose-parametrize"

RDEPENDS:${PN} += "python-abi \
python313-pytest"

inherit rpm
