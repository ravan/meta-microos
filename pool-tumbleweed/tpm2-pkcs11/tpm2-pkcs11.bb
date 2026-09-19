SUMMARY = "A PKCS#11 interface for TPM2 hardware"
DESCRIPTION = "tpm2-pkcs11 is a plugin shared library implementing the PKCS #11 \
Cryptographic Token Interface (Cryptoki) C API atop of TPM2 devices."
LICENSE = "BSD-2-Clause"

PV = "1.9.1"

RPM_NAME = "tpm2-pkcs11-1.9.1-2.3.aarch64.rpm"
RPM_HASH = "bcdc9edd62fe0964b3cf2188dce5e9108e95ab60c48ac0ae735a0d3d488c2152bf940d5e85f59dcbcf5806f6a6cb084a54a5e85b51ebb95d4d2fcd0e1159f9a6"

RPROVIDES:${PN} += "libtpm2-pkcs11-0 \
libtpm2-pkcs11.so.0 \
pkgconfig-tpm2-pkcs11 \
python3.13dist-tpm2-pkcs11-tools \
python3dist-tpm2-pkcs11-tools \
tpm2-pkcs11 \
tpm2-pkcs11-devel"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/pkg-config \
/usr/bin/python3.13 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libsqlite3.so.0 \
libtss2-esys.so.0 \
libtss2-fapi.so.1 \
libtss2-mu.so.0 \
libtss2-rc.so.0 \
libtss2-tctildr.so.0 \
libyaml-0.so.2 \
pkgconfig-libcrypto \
pkgconfig-sqlite3 \
pkgconfig-tss2-esys \
pkgconfig-tss2-mu \
python-abi \
python3.13dist-bcrypt \
python3.13dist-cryptography \
python3.13dist-pyasn1 \
python3.13dist-pyasn1-modules \
python3.13dist-pyyaml \
python3.13dist-tpm2-pytss"

inherit rpm
