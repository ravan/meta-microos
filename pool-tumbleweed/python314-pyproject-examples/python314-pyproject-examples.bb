SUMMARY = "Example pyproject.toml configs for testing"
DESCRIPTION = "Example pyproject.toml configs for testing."
LICENSE = "MIT"

PV = "2026.2.3"

RPM_NAME = "python314-pyproject-examples-2026.2.3-1.2.noarch.rpm"
RPM_HASH = "a95c838af4477e3ab66dcb5bb9d0eada065e0a2e0cef78edd6ce30281202c44dad2cfbf5bc7b1d997dfe3955b6d93579deeb804acb9ac7e453cc7ee3ad5bc985"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyproject-examples \
python314-pyproject-examples \
python3dist-pyproject-examples"

RDEPENDS:${PN} += "python-abi \
python314-coincidence \
python314-dom-toml \
python314-packaging \
python314-pytest"

inherit rpm
