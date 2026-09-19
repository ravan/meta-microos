SUMMARY = "System keyring service access from Python"
DESCRIPTION = "The Python keyring lib provides a way to access the system keyring service \
from python. It can be used in any application that needs safe password storage."
LICENSE = "MIT"

PV = "25.7.0"

RPM_NAME = "python314-keyring-25.7.0-1.4.noarch.rpm"
RPM_HASH = "2067ff251c6e75f6aeb4226207108111610c79f2d580d6a292982cca8546ac02f0f52db8affd88a524487c07696754b18020172d7c8cf1c0da07cbb774fda73f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-keyring \
python314-keyring \
python3dist-keyring"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-SecretStorage \
python314-jaraco.classes \
python314-jaraco.context \
python314-jaraco.functools \
python314-jeepney"

inherit rpm
