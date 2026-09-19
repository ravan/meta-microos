SUMMARY = "Validates X509 certificates and paths"
DESCRIPTION = "Validates X.509 certificates and paths; forked from wbond/certvalidator"
LICENSE = "MIT"

PV = "0.31.1"

RPM_NAME = "python313-pyhanko-certvalidator-0.31.1-2.2.noarch.rpm"
RPM_HASH = "465aac2d080d4d202235474b1cd793564ac637f843f67e214bfcb6cea4ec88524ff99c8b7d7c5bf303e7af40bfa91978cb62a81c7b8e719f97da0180f746a838"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyhanko-certvalidator \
python3.13dist-pyhanko-certvalidator \
python313-pyhanko-certvalidator \
python3dist-pyhanko-certvalidator"

RDEPENDS:${PN} += "python-abi \
python313-asn1crypto \
python313-cryptography \
python313-oscrypto \
python313-requests \
python313-uritools"

inherit rpm
