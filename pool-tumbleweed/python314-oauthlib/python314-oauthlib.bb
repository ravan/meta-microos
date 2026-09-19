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

RPM_NAME = "python314-oauthlib-3.3.1-1.3.noarch.rpm"
RPM_HASH = "f216d6899387aef5824b73f178847099797256462464a47fc87f20bd1ac4a6b4bc643f0328a1a1f04cd62c9054b953324e26c6d0eee8c8b7e258b0d0538d1db5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-oauthlib \
python314-oauthlib \
python3dist-oauthlib"

RDEPENDS:${PN} += "python-abi \
python314-PyJWT \
python314-blinker \
python314-cryptography"

inherit rpm
