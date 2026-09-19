SUMMARY = "Validates X509 certificates and paths"
DESCRIPTION = "Validates X.509 certificates and paths; forked from wbond/certvalidator"
LICENSE = "MIT"

PV = "0.31.1"

RPM_NAME = "python314-pyhanko-certvalidator-0.31.1-2.2.noarch.rpm"
RPM_HASH = "918717162401e211564916f058acb5ad12e0b2de40c003c014c576a5794341621ba7be45a0ead39d75d7a4581e5b39d6eec06e4f7dc0c5c28de77dcaad6167ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyhanko-certvalidator \
python314-pyhanko-certvalidator \
python3dist-pyhanko-certvalidator"

RDEPENDS:${PN} += "python-abi \
python314-asn1crypto \
python314-cryptography \
python314-oscrypto \
python314-requests \
python314-uritools"

inherit rpm
