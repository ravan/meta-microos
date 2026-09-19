SUMMARY = "PKCS#11 (Cryptoki) support for Python"
DESCRIPTION = "PKCS#11 (Cryptoki) support for Python"
LICENSE = "MIT"

PV = "0.9.5"

RPM_NAME = "python313-python-pkcs11-0.9.5-1.1.aarch64.rpm"
RPM_HASH = "b8ddb74fa562973f33749994df249e440f33796e4be960b0dd30c3039d33caee167280f83fcdd4342fbfce27942d674b25b3a796d49fb8569f92254055157291"

RPROVIDES:${PN} += "python3-python-pkcs11 \
python3.13dist-python-pkcs11 \
python313-python-pkcs11 \
python3dist-python-pkcs11"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python313-asn1crypto"

inherit rpm
