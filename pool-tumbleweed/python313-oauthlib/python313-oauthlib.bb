SUMMARY = "A Generic Implementation of the OAuth Request-Signing Logic"
DESCRIPTION = "A generic, spec-compliant, thorough implementation of the OAuth request-signing \
logic. \
 \
OAuth often seems complicated and difficult-to-implement. There are several \
prominent libraries for signing OAuth requests, but they all suffer from one or \
both of the following: \
 \
1. They predate the OAuth 1.0 spec, AKA RFC 5849. \
2. They predate the OAuth 2.0 spec, AKA RFC 6749. \
3. They assume the usage of a specific HTTP request library. \
 \
OAuthLib is a generic utility which implements the logic of OAuth without \
assuming a specific HTTP request object. Use it to graft OAuth support onto your \
favorite HTTP library. If you're a maintainer of such a library, write a thin \
veneer on top of OAuthLib and get OAuth support for very little effort."
LICENSE = "BSD-3-Clause"

PV = "3.3.1"

RPM_NAME = "python313-oauthlib-3.3.1-1.3.noarch.rpm"
RPM_HASH = "7a7a454e2ab6c779f531415dd8397f8e7a13677e1bb0ea0e6daffa6ef7a6f23457c37b1c673dfb67a00ad97dfcf6ad5240325a7bfc10e8e160875727edd1cdf9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oauthlib \
python3.13dist-oauthlib \
python313-oauthlib \
python3dist-oauthlib"

RDEPENDS:${PN} += "python-abi \
python313-PyJWT \
python313-blinker \
python313-cryptography"

inherit rpm
