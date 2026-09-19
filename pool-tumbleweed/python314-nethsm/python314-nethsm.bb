SUMMARY = "Python Library to manage NetHSM(s)"
DESCRIPTION = " \
 \
Python client for NetHSM. NetHSM documentation available here: [NetHSM documentation](https://docs.nitrokey.com/nethsm/)"
LICENSE = "Apache-2.0"

PV = "2.1.2"

RPM_NAME = "python314-nethsm-2.1.2-1.2.noarch.rpm"
RPM_HASH = "dfdb8cde9e236f0718be17a4106dc764cd02852f5c97a215e2282a4a78d24218032bd5720f0b747d7630cfd3726db3644881771a6fe942ffd25f44834370b33c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-nethsm \
python314-nethsm \
python3dist-nethsm"

RDEPENDS:${PN} += "-python314-typing-extensions >= 4.3.0 with python314-typing-extensions < 5 \
-python314-urllib3 >= 2.0 with python314-urllib3 < 3 \
python-abi \
python314-certifi \
python314-cryptography"

inherit rpm
