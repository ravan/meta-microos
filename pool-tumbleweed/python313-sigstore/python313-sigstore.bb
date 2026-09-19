SUMMARY = "A tool for signing Python package distributions"
DESCRIPTION = "sigstore is a Python tool for generating and verifying Sigstore \
signatures. You can use it to sign and verify Python package \
distributions, or anything else!"
LICENSE = "Apache-2.0"

PV = "4.2.0"

RPM_NAME = "python313-sigstore-4.2.0-2.2.noarch.rpm"
RPM_HASH = "c4fdd9615c6936517e96b1c3e1e04f420fc3c580714e77d4a8e01544168896837d197dee0d7ef7a4e65beafa49e9a79d7353f89c89c75b0e1cc0d759abe1c390"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sigstore \
python3.13dist-sigstore \
python313-sigstore \
python3dist-sigstore"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-PyJWT \
python313-cryptography \
python313-id \
python313-platformdirs \
python313-pyOpenSSL \
python313-pyasn1 \
python313-pydantic \
python313-requests \
python313-rfc3161-client \
python313-rfc8785 \
python313-rich \
python313-sigstore-models \
python313-sigstore-rekor-types \
python313-tuf"

inherit rpm
