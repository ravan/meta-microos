SUMMARY = "General Hardware Management Initiative (IPMI and others)"
DESCRIPTION = "This is a pure python implementation of IPMI protocol. \
 \
pyghmicons and pyghmiutil are example scripts to show how one may incorporate \
this library into python code"
LICENSE = "Apache-2.0"

PV = "1.6.19"

RPM_NAME = "python313-pyghmi-1.6.19-1.1.noarch.rpm"
RPM_HASH = "6a0506de388843954c65fc3986dadb346831880b0cad0bf6511f4473ed019d4a4e9162b5ec7e49ee0373ecd388ea9e5d7ef8bc0a59b7cff2bcb17981c521a5f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyghmi \
python3.13dist-pyghmi \
python313-pyghmi \
python3dist-pyghmi"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-cryptography \
python313-python-dateutil"

inherit rpm
