SUMMARY = "The ultimate Python library for JOSE RFCs"
DESCRIPTION = "The ultimate Python library for JOSE RFCs, including JWS, JWE, JWK, JWA, JWT"
LICENSE = "BSD-3-Clause"

PV = "1.7.5"

RPM_NAME = "python314-joserfc-1.7.5-1.1.noarch.rpm"
RPM_HASH = "984facf63873dc5aae19b068144ae1a6e16f10a720aa7404a658ff7090781472f996f52689dc7b7f325cfb91930799a97a9998067c81b894d6f912abc1fff9fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-joserfc \
python314-joserfc \
python3dist-joserfc"

RDEPENDS:${PN} += "python-abi \
python314-cryptography"

inherit rpm
