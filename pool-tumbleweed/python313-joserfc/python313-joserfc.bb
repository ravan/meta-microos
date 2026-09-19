SUMMARY = "The ultimate Python library for JOSE RFCs"
DESCRIPTION = "The ultimate Python library for JOSE RFCs, including JWS, JWE, JWK, JWA, JWT"
LICENSE = "BSD-3-Clause"

PV = "1.7.5"

RPM_NAME = "python313-joserfc-1.7.5-1.1.noarch.rpm"
RPM_HASH = "675ad2228f8dfdf11e69b984d0ce55e1ed8133a238b0c08ce030dee801acdc2da5aad6c429e7cf4794be45c19a65042c43871817e2fdf031fa66b9529c078952"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-joserfc \
python3.13dist-joserfc \
python313-joserfc \
python3dist-joserfc"

RDEPENDS:${PN} += "python-abi \
python313-cryptography"

inherit rpm
