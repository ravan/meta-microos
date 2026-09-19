SUMMARY = "Plugin for pytest to check FLAKE8 requirements"
DESCRIPTION = "Plugin for pytest for efficiently checking PEP8 compliance."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python314-pytest-flake8-1.3.0-2.4.noarch.rpm"
RPM_HASH = "68e1518990ad2d7ade0bb787dab5685f77fa6280f267efdd099578ca56e437fa9857134b5cd814caf1c6422b4b5cc5d85276f9d095c135a05ed956d8d35e7d70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-flake8 \
python314-pytest-flake8 \
python3dist-pytest-flake8"

RDEPENDS:${PN} += "python-abi \
python314-flake8 \
python314-pytest"

inherit rpm
