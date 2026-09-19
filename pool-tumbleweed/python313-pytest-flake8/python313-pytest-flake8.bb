SUMMARY = "Plugin for pytest to check FLAKE8 requirements"
DESCRIPTION = "Plugin for pytest for efficiently checking PEP8 compliance."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python313-pytest-flake8-1.3.0-2.4.noarch.rpm"
RPM_HASH = "16e9722e0b09fcf63e4f5b3db24cfd258dc77b9118bff17f2585e01932bc46d117c65c0e65b59c3c3d46c61e515850cf3588c113d7a356816b0232f40a5601f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-flake8 \
python3.13dist-pytest-flake8 \
python313-pytest-flake8 \
python3dist-pytest-flake8"

RDEPENDS:${PN} += "python-abi \
python313-flake8 \
python313-pytest"

inherit rpm
