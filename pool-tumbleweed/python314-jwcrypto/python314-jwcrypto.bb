SUMMARY = "Python module package implementing JOSE Web standards"
DESCRIPTION = "A Python implementation of the JOSE Working Group documents: \
RFC 7515 - JSON Web Signature (JWS) \
RFC 7516 - JSON Web Encryption (JWE) \
RFC 7517 - JSON Web Key (JWK) \
RFC 7518 - JSON Web Algorithms (JWA) \
RFC 7519 - JSON Web Token (JWT) \
RFC 7520 - Examples of Protecting Content Using JSON Object Signing and Encryption (JOSE)"
LICENSE = "LGPL-3.0-only"

PV = "1.6.0"

RPM_NAME = "python314-jwcrypto-1.6.0-1.1.noarch.rpm"
RPM_HASH = "cc682ef170475aaf1b50b4d977447c4f9a799be94f19459cd423bd58b0f689b5cef8c8ec0f1d8a8ddd829a679a947abfa4cbf8fd30f800551bfa50c7ccfc6d70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jwcrypto \
python314-jwcrypto \
python3dist-jwcrypto"

RDEPENDS:${PN} += "python-abi \
python314-cryptography \
python314-typing-extensions"

inherit rpm
