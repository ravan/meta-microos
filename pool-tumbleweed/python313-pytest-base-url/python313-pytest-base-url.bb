SUMMARY = "Pytest plugin for URL based testing"
DESCRIPTION = "pytest plugin for URL based testing."
LICENSE = "MPL-2.0"

PV = "2.1.0"

RPM_NAME = "python313-pytest-base-url-2.1.0-1.11.noarch.rpm"
RPM_HASH = "f268f40067e59025796c117a21ff42f2c7f743c8d5e3337aabfbb992965e042b96d202ab19e8087971dc06a904a3a06c491bdf9b65870b34b040d79e539e7343"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-base-url \
python3.13dist-pytest-base-url \
python313-pytest-base-url \
python3dist-pytest-base-url"

RDEPENDS:${PN} += "python-abi \
python313-pytest \
python313-requests"

inherit rpm
