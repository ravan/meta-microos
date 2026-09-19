SUMMARY = "Python package providing access to the Keycloak API"
DESCRIPTION = "Python package providing access to the Keycloak API"
LICENSE = "MIT"

PV = "7.1.1"

RPM_NAME = "python314-python-keycloak-7.1.1-1.2.noarch.rpm"
RPM_HASH = "b22732f6c2fa00a32bceafac7c3b6efc51f0c7a61f35779979bb8195ff27a1b97ffabbbd90857e41b5385689f2345a4a669e30ad4260385ba1ddbaad83200654"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-keycloak \
python314-python-keycloak \
python3dist-python-keycloak"

RDEPENDS:${PN} += "python-abi \
python314-aiofiles \
python314-deprecation \
python314-httpx \
python314-jwcrypto \
python314-requests \
python314-requests-toolbelt"

inherit rpm
