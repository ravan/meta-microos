SUMMARY = "Cryptographic and general routines for Secure Systems Lab"
DESCRIPTION = "Cryptographic and general-purpose routines for Secure Systems Lab projects at NYU"
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python313-securesystemslib-1.4.0-1.3.noarch.rpm"
RPM_HASH = "88479a3d8a801f9d42d924629696dafbcd8f87770868a7c4c998da27a31da39fd4a00fd14fb8a1db7a0098684bbf8724656c0c5059eb411d33134a6494b55008"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-securesystemslib \
python3.13dist-securesystemslib \
python313-securesystemslib \
python3dist-securesystemslib"

RDEPENDS:${PN} += "/usr/bin/bash \
python-abi \
python313-PyKCS11 \
python313-asn1crypto \
python313-cryptography"

inherit rpm
