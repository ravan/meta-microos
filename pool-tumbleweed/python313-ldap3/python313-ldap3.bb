SUMMARY = "A strictly RFC 4511 conforming LDAP V3 pure Python client"
DESCRIPTION = "ldap3 is a strictly RFC 4511 conforming LDAP V3 pure Python **client**. \
The same codebase works with Python, Python 3, PyPy and PyPy3. \
 \
This project was formerly named **python3-ldap**. \
The name has been changed to avoid confusion with the python-ldap library."
LICENSE = "LGPL-3.0-only"

PV = "2.9.1"

RPM_NAME = "python313-ldap3-2.9.1-4.5.noarch.rpm"
RPM_HASH = "9b7251b56cdc2b9cf23721c4f7ccc8898a90b1f9945f832032af5191a6f4275c416b8a4e31d58fac13f6e984678afc0bd82eccc86a80a487f0ba91af8878f17a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ldap3 \
python3.13dist-ldap3 \
python313-ldap3 \
python3dist-ldap3"

RDEPENDS:${PN} += "python-abi \
python313-pyasn1"

inherit rpm
