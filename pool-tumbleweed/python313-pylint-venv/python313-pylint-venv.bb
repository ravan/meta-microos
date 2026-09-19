SUMMARY = "Use the same Pylint installation with different virtual environments"
DESCRIPTION = "pylint-venv provides a Pylint init-hook to use the same Pylint installation with different virtual environments."
LICENSE = "MIT"

PV = "3.0.4"

RPM_NAME = "python313-pylint-venv-3.0.4-1.9.noarch.rpm"
RPM_HASH = "9caf5bb7e013396cc1104f3bcab279768cf4743188f167b23233786ecc24d8de49183d8442e1bbc91f069e7ae824001ed98a50b3f1f89954180957afe7ff67ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pylint-venv \
python3.13dist-pylint-venv \
python313-pylint-venv \
python3dist-pylint-venv"

RDEPENDS:${PN} += "python-abi"

inherit rpm
