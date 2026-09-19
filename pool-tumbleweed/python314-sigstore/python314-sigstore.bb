SUMMARY = "A tool for signing Python package distributions"
DESCRIPTION = "sigstore is a Python tool for generating and verifying Sigstore \
signatures. You can use it to sign and verify Python package \
distributions, or anything else!"
LICENSE = "Apache-2.0"

PV = "4.2.0"

RPM_NAME = "python314-sigstore-4.2.0-2.2.noarch.rpm"
RPM_HASH = "298e752661d66a684499bb8c130cff3dd217f7d583ae3884909485df2a62a1bf5c11651ef745ed59574ecf93dc7153fb967fbe4b5e9c89748499b890dc8d34a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sigstore \
python314-sigstore \
python3dist-sigstore"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-PyJWT \
python314-cryptography \
python314-id \
python314-platformdirs \
python314-pyOpenSSL \
python314-pyasn1 \
python314-pydantic \
python314-requests \
python314-rfc3161-client \
python314-rfc8785 \
python314-rich \
python314-sigstore-models \
python314-sigstore-rekor-types \
python314-tuf"

inherit rpm
