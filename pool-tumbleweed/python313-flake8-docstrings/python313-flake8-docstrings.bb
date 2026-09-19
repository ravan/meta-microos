SUMMARY = "Extension for flake8 which uses pydocstyle to check docstrings"
DESCRIPTION = "A module that adds an extension for the pydocstyle tool to flake8."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python313-flake8-docstrings-1.7.0-2.5.noarch.rpm"
RPM_HASH = "de8ae177479cf29923c35f2c46299e0f7ded0e8e8d7b42ba2c5514a593316c733211bc54fef02143e8513a987f56ef8f6f6418dbf837ab98283f0628bad5e114"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flake8-docstrings \
python3.13dist-flake8-docstrings \
python313-flake8-docstrings \
python3dist-flake8-docstrings"

RDEPENDS:${PN} += "python-abi \
python313-flake8 \
python313-flake8-polyfill \
python313-pydocstyle"

inherit rpm
