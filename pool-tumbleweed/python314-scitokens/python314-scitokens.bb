SUMMARY = "SciToken reference implementation library"
DESCRIPTION = "SciTokens provide a token format for distributed authorization. The tokens are \
self-describing, can be verified in a distributed fashion (no need to contact \
the issuer to determine if the token is valid). This is convenient for a \
federated environment where several otherwise-independent storage endpoints \
want to delegate trust for an issuer for managing a storage allocation."
LICENSE = "Apache-2.0"

PV = "1.8.1"

RPM_NAME = "python314-scitokens-1.8.1-2.2.noarch.rpm"
RPM_HASH = "1d0a2e6cdb569368b2b3dec31c88e849ab8f5c586370869264b6a4e722be025f58e01b1609f3fe2cbe2bcf90357fc7686c9797d260128edfdd49552a6723bad1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-scitokens \
python314-scitokens \
python3dist-scitokens"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-PyJWT \
python314-cryptography \
python314-requests \
update-alternatives"

inherit rpm
