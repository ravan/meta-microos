SUMMARY = "Python package providing access to the Keycloak API"
DESCRIPTION = "Python package providing access to the Keycloak API"
LICENSE = "MIT"

PV = "7.1.1"

RPM_NAME = "python313-python-keycloak-7.1.1-1.2.noarch.rpm"
RPM_HASH = "f8747da6b18d7ce33ddb9c4c6c124fd9b6b45e8e63c699d6a76724048cf43118b1b3f0bf9202e4e51bbab1be899d80a27fa64d6a925ef95c25bc91868772b89c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-keycloak \
python3.13dist-python-keycloak \
python313-python-keycloak \
python3dist-python-keycloak"

RDEPENDS:${PN} += "python-abi \
python313-aiofiles \
python313-deprecation \
python313-httpx \
python313-jwcrypto \
python313-requests \
python313-requests-toolbelt"

inherit rpm
