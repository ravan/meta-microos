SUMMARY = "Python streaming multipart parser"
DESCRIPTION = "A streaming multipart parser for Python."
LICENSE = "Apache-2.0"

PV = "0.0.32"

RPM_NAME = "python313-python-multipart-0.0.32-1.3.noarch.rpm"
RPM_HASH = "6c66e37c7d1d2304aff79b787dab35979a07b520b3bcde5f9babf20a27f4e00c533ba6521a84601cd7ac99c30de9c5b3a90d99e3e11dcbe09e57bd94e97678d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-multipart \
python3.13dist-python-multipart \
python313-python-multipart \
python3dist-python-multipart"

RDEPENDS:${PN} += "python-abi"

inherit rpm
