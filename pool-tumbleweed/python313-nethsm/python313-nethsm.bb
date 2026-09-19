SUMMARY = "Python Library to manage NetHSM(s)"
DESCRIPTION = " \
 \
Python client for NetHSM. NetHSM documentation available here: [NetHSM documentation](https://docs.nitrokey.com/nethsm/)"
LICENSE = "Apache-2.0"

PV = "2.1.2"

RPM_NAME = "python313-nethsm-2.1.2-1.2.noarch.rpm"
RPM_HASH = "f409ddc8818c595e51bf7a2babd1da36076fa790bbe7ccd69fec379d80b752c97af1353cbeaa77e9bfae40345f1f73d4d15930a7a80f3ae6a4bd5dcce0353523"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nethsm \
python3.13dist-nethsm \
python313-nethsm \
python3dist-nethsm"

RDEPENDS:${PN} += "-python313-typing-extensions >= 4.3.0 with python313-typing-extensions < 5 \
-python313-urllib3 >= 2.0 with python313-urllib3 < 3 \
python-abi \
python313-certifi \
python313-cryptography"

inherit rpm
