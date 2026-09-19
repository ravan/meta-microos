SUMMARY = "PKCS#11 (Cryptoki) support for Python"
DESCRIPTION = "PKCS#11 (Cryptoki) support for Python"
LICENSE = "MIT"

PV = "0.9.5"

RPM_NAME = "python314-python-pkcs11-0.9.5-1.1.aarch64.rpm"
RPM_HASH = "169b4e5607917036647a4d58aac210d175851bcbe33d7cf36dc8290525fc328cec7fc35e951dd74a7663451b649b6591435c3208d75ea0ac0bd44c0436121223"

RPROVIDES:${PN} += "python3.14dist-python-pkcs11 \
python314-python-pkcs11 \
python3dist-python-pkcs11"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python314-asn1crypto"

inherit rpm
