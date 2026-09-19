SUMMARY = "A strictly RFC 4511 conforming LDAP V3 pure Python client"
DESCRIPTION = "ldap3 is a strictly RFC 4511 conforming LDAP V3 pure Python **client**. \
The same codebase works with Python, Python 3, PyPy and PyPy3. \
 \
This project was formerly named **python3-ldap**. \
The name has been changed to avoid confusion with the python-ldap library."
LICENSE = "LGPL-3.0-only"

PV = "2.9.1"

RPM_NAME = "python314-ldap3-2.9.1-4.5.noarch.rpm"
RPM_HASH = "da16d12980a5845e7cf377f92d8ca8311146380b78e5a737ca8ee0f6b874009c249e3118702c57b3b89ab235097d4adf79bb06a7bb4e0d068ff057f782b78e69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ldap3 \
python314-ldap3 \
python3dist-ldap3"

RDEPENDS:${PN} += "python-abi \
python314-pyasn1"

inherit rpm
