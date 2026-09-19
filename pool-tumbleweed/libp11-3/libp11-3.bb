SUMMARY = "Library Implementing a Small Layer on Top of PKCS#11 API"
DESCRIPTION = "Libp11 is a library implementing a small layer on top of PKCS#11 API to \
make using PKCS#11 implementations easier. \
 \
The official name for PKCS#11 is 'RSA Security Inc. PKCS #11 \
Cryptographic Token Interface (Cryptoki)'. \
 \
Libp11 source code includes the official header files (version 2.20) \
and thus is 'derived from the RSA Security Inc. PKCS #11 Cryptographic \
Token Interface (Cryptoki)'."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.17"

RPM_NAME = "libp11-3-0.4.17-1.4.aarch64.rpm"
RPM_HASH = "fd08808e3a1d50ff28485f84790509e6adcb7b3fd95e8fca68d57669ed00115bd6d4c0fb6e3d93e136c7aad214ebac97a1a091565f56ec0edc341acfda654d1a"

RPROVIDES:${PN} += "libp11-3 \
libp11.so.3 \
openssl-pkcs11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3"

inherit rpm
