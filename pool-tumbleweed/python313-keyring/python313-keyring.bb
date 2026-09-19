SUMMARY = "System keyring service access from Python"
DESCRIPTION = "The Python keyring lib provides a way to access the system keyring service \
from python. It can be used in any application that needs safe password storage."
LICENSE = "MIT"

PV = "25.7.0"

RPM_NAME = "python313-keyring-25.7.0-1.4.noarch.rpm"
RPM_HASH = "290ad91b9ff44219b21a89c0ffad23f0b12fad9ea74422a41ae3853ef7c0e141639e3b6a43ee86ec67c1a647c36527795df16a217ee231cad087f1c2955af55f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-keyring \
python3.13dist-keyring \
python313-keyring \
python3dist-keyring"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-SecretStorage \
python313-jaraco.classes \
python313-jaraco.context \
python313-jaraco.functools \
python313-jeepney"

inherit rpm
