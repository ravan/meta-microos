SUMMARY = "Entra ID credentials provider implementation for Redis-py client"
DESCRIPTION = "Entra ID credentials provider implementation for Redis-py client"
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "python313-redis-entraid-1.2.1-1.2.noarch.rpm"
RPM_HASH = "b3b34de9d41de9fd354c3df8739437fe7a9ed64850c0e1237dba8ca785d9fc0c0d6fe5d91398d24ba3ad1d0f768f112100c1bd4b417a56ff16e577a0442a15bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-redis-entraid \
python3.13dist-redis-entraid \
python313-redis-entraid \
python3dist-redis-entraid"

RDEPENDS:${PN} += "python-abi \
python313-PyJWT \
python313-azure-identity \
python313-msal \
python313-redis \
python313-requests"

inherit rpm
