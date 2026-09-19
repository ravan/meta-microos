SUMMARY = "A caching library for Python"
DESCRIPTION = "Cachy provides a caching library."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python313-cachy-0.3.0-7.5.noarch.rpm"
RPM_HASH = "d3967b0b6a32c90b4a70e1bd4a33d049f3d9463a6c6b0c84ba24f69f5a2a00f12dfc02683709db81f1a9b96d4ff5db6a17dc48f5c7b9eada8fd96e9878ef043b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cachy \
python3.13dist-cachy \
python313-cachy \
python3dist-cachy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
