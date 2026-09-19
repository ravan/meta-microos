SUMMARY = "A pytest fixture for testing flake8 plugins"
DESCRIPTION = "A pytest fixture for testing flake8 plugins."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python313-pytest-flake8-path-1.7.0-1.2.noarch.rpm"
RPM_HASH = "c38ab5774885f005b333dd79aaffcdffcbf632836f7fcf599cf9955acef14041d4d115f6b27edfcb9081706a8aa439d46b333a2f2c41f9e83399533b09a9a68d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-flake8-path \
python3.13dist-pytest-flake8-path \
python313-pytest-flake8-path \
python3dist-pytest-flake8-path"

RDEPENDS:${PN} += "python-abi \
python313-flake8 \
python313-pytest"

inherit rpm
