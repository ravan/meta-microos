SUMMARY = "Use the same Pylint installation with different virtual environments"
DESCRIPTION = "pylint-venv provides a Pylint init-hook to use the same Pylint installation with different virtual environments."
LICENSE = "MIT"

PV = "3.0.4"

RPM_NAME = "python314-pylint-venv-3.0.4-1.9.noarch.rpm"
RPM_HASH = "c3a9d2bdca247d215f18a26b966b7052328a031cc125c81db613fe22c127726addf4028a35b5da266c72239b9581d07b705179db5140a8eae4a9c278055d7eb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pylint-venv \
python314-pylint-venv \
python3dist-pylint-venv"

RDEPENDS:${PN} += "python-abi"

inherit rpm
