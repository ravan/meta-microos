SUMMARY = "Entra ID credentials provider implementation for Redis-py client"
DESCRIPTION = "Entra ID credentials provider implementation for Redis-py client"
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "python314-redis-entraid-1.2.1-1.2.noarch.rpm"
RPM_HASH = "3c018e56e6b0d9e1de37f921f1b6f9ffd175450e352ded5aefdf3a237970259bc79e90ee3d73170757d9f7d7a273e4bdcf806a09b6a67ee19ebb466f316b8208"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-redis-entraid \
python314-redis-entraid \
python3dist-redis-entraid"

RDEPENDS:${PN} += "python-abi \
python314-PyJWT \
python314-azure-identity \
python314-msal \
python314-redis \
python314-requests"

inherit rpm
