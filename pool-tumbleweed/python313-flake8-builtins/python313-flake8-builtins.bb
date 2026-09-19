SUMMARY = "Flake8 Builtins plugin"
DESCRIPTION = "This plugin checks for Python builtins being used as variables or parameters."
LICENSE = "GPL-2.0-only"

PV = "3.1.0"

RPM_NAME = "python313-flake8-builtins-3.1.0-1.4.noarch.rpm"
RPM_HASH = "f6a87086f0155ddc9ae4b7dce184e4b9202aff3ea687076a1ce93a4c2a80c9bfe895c26b71733c3ef1f7cfe8b95d5b9e7d0eaef4ce6001bd0e1c9e669fc3d3aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flake8-builtins \
python3.13dist-flake8-builtins \
python313-flake8-builtins \
python3dist-flake8-builtins"

RDEPENDS:${PN} += "python-abi \
python313-flake8"

inherit rpm
