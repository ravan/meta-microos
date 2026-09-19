SUMMARY = "X.509 certificates validation"
DESCRIPTION = "A Python library for validating X.509 certificates or paths. Supports various \
options, including: validation at a specific moment in time, whitelisting and \
revocation checks."
LICENSE = "MIT"

PV = "0.11.1"

RPM_NAME = "python314-certvalidator-0.11.1-1.9.noarch.rpm"
RPM_HASH = "f03d6f42aaf0cda90f58db1174cef97ea94aa9891ce6befc30f623ac112ebafe8c5221614063de00bf2c5b4ebf835cbbe73b1ca364a1eb96a548b0a8d7669f01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-certvalidator \
python314-certvalidator \
python3dist-certvalidator"

RDEPENDS:${PN} += "python-abi \
python314-asn1crypto \
python314-oscrypto"

inherit rpm
