SUMMARY = "Python interface for SEGGER J-Link"
DESCRIPTION = "Python interface for SEGGER J-Link."
LICENSE = "Apache-2.0"

PV = "2.0.1"

RPM_NAME = "python313-pylink-square-2.0.1-1.2.noarch.rpm"
RPM_HASH = "a2f1cae63dc204ea3f3fecf263b4f0d4968db25c124ab3e168f860c064e90ea31527c3cd638998a880e2a32dbfd65af6f4adec6046842075d49608e0adff1bf1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pylink-square \
python3.13dist-pylink-square \
python313-pylink-square \
python3dist-pylink-square"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-psutil \
python313-six \
update-alternatives"

inherit rpm
