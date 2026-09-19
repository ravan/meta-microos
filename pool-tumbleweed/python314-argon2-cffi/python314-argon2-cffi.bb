SUMMARY = "The Argon2 password hashing algorithm for Python"
DESCRIPTION = "A Python module that uses CFFI to access the Argon2 password hashing \
C library."
LICENSE = "MIT"

PV = "25.1.0"

RPM_NAME = "python314-argon2-cffi-25.1.0-1.5.noarch.rpm"
RPM_HASH = "362b78f2490a2b493692e77b671452a24a7d40a98b734715d560272d0d47f8e21d7d244aca175a3afdc49f28fb3cd35b298657e17c2c80e5c18dfc172dc96cb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-argon2-cffi \
python314-argon2-cffi \
python3dist-argon2-cffi"

RDEPENDS:${PN} += "python-abi \
python314-argon2-cffi-bindings"

inherit rpm
