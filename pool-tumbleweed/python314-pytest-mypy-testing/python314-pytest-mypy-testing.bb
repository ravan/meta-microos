SUMMARY = "Pytest plugin to check mypy output"
DESCRIPTION = "pytest-mypy-testing — Plugin to test mypy output with pytest \
 \
`pytest-mypy-testing` provides a pytest plugin to test that \
mypy produces a given output. As mypy can be told to display the \
type of an expression this allows us to check mypys type interference."
LICENSE = "Apache-2.0 | MIT"

PV = "0.2.0"

RPM_NAME = "python314-pytest-mypy-testing-0.2.0-2.1.noarch.rpm"
RPM_HASH = "c8d83691ddf2d5c7e18df0e10238de78cd325b3b3238837f30bbb8eadc27d19076e5fcaf70e3d4304ab49e023067dad81375817357dd06f3bbdb121de914cb07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-mypy-testing \
python314-pytest-mypy-testing \
python3dist-pytest-mypy-testing"

RDEPENDS:${PN} += "python-abi \
python314-mypy \
python314-pytest"

inherit rpm
