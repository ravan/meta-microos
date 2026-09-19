SUMMARY = "General Hardware Management Initiative (IPMI and others)"
DESCRIPTION = "This is a pure python implementation of IPMI protocol. \
 \
pyghmicons and pyghmiutil are example scripts to show how one may incorporate \
this library into python code"
LICENSE = "Apache-2.0"

PV = "1.6.19"

RPM_NAME = "python314-pyghmi-1.6.19-1.1.noarch.rpm"
RPM_HASH = "b88197632e2122d3379605f5ffb85c66b6ed1efe44dff3ef44e9b1d4c99fb08a980cf51e0d0537e800fc711968c89f3fb8949699a5a40ec3bd9a4a76ea94848a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyghmi \
python314-pyghmi \
python3dist-pyghmi"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-cryptography \
python314-python-dateutil"

inherit rpm
