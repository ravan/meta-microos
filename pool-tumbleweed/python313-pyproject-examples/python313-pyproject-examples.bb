SUMMARY = "Example pyproject.toml configs for testing"
DESCRIPTION = "Example pyproject.toml configs for testing."
LICENSE = "MIT"

PV = "2026.2.3"

RPM_NAME = "python313-pyproject-examples-2026.2.3-1.2.noarch.rpm"
RPM_HASH = "6b1073633c4903cbe549836468fdc0866eda876293779b84b9391c404c00492ceb967df1dc6f9e8e1bc927e23f0c733303a73c5877495009e24aabd2ef05f91b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyproject-examples \
python3.13dist-pyproject-examples \
python313-pyproject-examples \
python3dist-pyproject-examples"

RDEPENDS:${PN} += "python-abi \
python313-coincidence \
python313-dom-toml \
python313-packaging \
python313-pytest"

inherit rpm
