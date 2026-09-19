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

RPM_NAME = "python313-jwcrypto-1.6.0-1.1.noarch.rpm"
RPM_HASH = "e510ef7840c33048b3a328deae8a192abfd342adf4e82a0c8f37e926406bbe694353cdee34af22db1e6e5e1a3d3158488a5792064acf9714ce0b6cbcdd448df4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jwcrypto \
python3.13dist-jwcrypto \
python313-jwcrypto \
python3dist-jwcrypto"

RDEPENDS:${PN} += "python-abi \
python313-cryptography \
python313-typing-extensions"

inherit rpm
