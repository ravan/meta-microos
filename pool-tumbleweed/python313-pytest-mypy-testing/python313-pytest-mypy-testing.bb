SUMMARY = "Pytest plugin to check mypy output"
DESCRIPTION = "pytest-mypy-testing — Plugin to test mypy output with pytest \
 \
`pytest-mypy-testing` provides a pytest plugin to test that \
mypy produces a given output. As mypy can be told to display the \
type of an expression this allows us to check mypys type interference."
LICENSE = "Apache-2.0 | MIT"

PV = "0.2.0"

RPM_NAME = "python313-pytest-mypy-testing-0.2.0-2.1.noarch.rpm"
RPM_HASH = "2ceeb186a8356900f0dd219f89b73e3e1afc71bba12b021ea63999829859e07990430f2d270b55330ac2b62a021e9235c94ef8473efb85d8e31020e7cfe5c15b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-mypy-testing \
python3.13dist-pytest-mypy-testing \
python313-pytest-mypy-testing \
python3dist-pytest-mypy-testing"

RDEPENDS:${PN} += "python-abi \
python313-mypy \
python313-pytest"

inherit rpm
