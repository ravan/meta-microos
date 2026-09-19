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

RPM_NAME = "openssl-engine-libp11-0.4.17-1.4.aarch64.rpm"
RPM_HASH = "aaa48facd84908b239ac64facecb7e49afbf160029c1672d7fc246dd684afac257cfb147346559ef2df56b8732d44be866fc9ec3ec9346918ca2672b5e87af70"

RPROVIDES:${PN} += "openssl-engine-libp11 \
openssl-ibmpkcs11"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3"

inherit rpm
