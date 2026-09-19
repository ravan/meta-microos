SUMMARY = "Service identity verification for pyOpenSSL"
DESCRIPTION = "service_identity aspires to give you all the tools you need for \
verifying whether a certificate is valid for the intended purposes. \
 \
In the simplest case, this means host name verification. However, \
service_identity implements RFC 6125 fully and plans to add other \
relevant RFCs too."
LICENSE = "MIT"

PV = "26.1.0"

RPM_NAME = "python314-service_identity-26.1.0-1.2.noarch.rpm"
RPM_HASH = "7fc3dc3b88f7795f2d1d25a0b77d73e23c04cb7cb6850b00ac67f22f3c67dbe1640613bcfecd13e963b6552df5632af6c2b958b33d506c56f659b4d8f38e65c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-service-identity \
python314-service-identity \
python3dist-service-identity"

RDEPENDS:${PN} += "python-abi \
python314-attrs \
python314-cryptography \
python314-pyasn1 \
python314-pyasn1-modules"

inherit rpm
