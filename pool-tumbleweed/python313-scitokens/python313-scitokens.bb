SUMMARY = "SciToken reference implementation library"
DESCRIPTION = "SciTokens provide a token format for distributed authorization. The tokens are \
self-describing, can be verified in a distributed fashion (no need to contact \
the issuer to determine if the token is valid). This is convenient for a \
federated environment where several otherwise-independent storage endpoints \
want to delegate trust for an issuer for managing a storage allocation."
LICENSE = "Apache-2.0"

PV = "1.8.1"

RPM_NAME = "python313-scitokens-1.8.1-2.2.noarch.rpm"
RPM_HASH = "93c0a54efbf7800f1963421b67911693021abb8c859490f155cd831bf4c41487aa938d7bf772e5acbe7bbf7b9703971ade70e23244d0282c50530af26814880f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-scitokens \
python3.13dist-scitokens \
python313-scitokens \
python3dist-scitokens"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-PyJWT \
python313-cryptography \
python313-requests \
update-alternatives"

inherit rpm
