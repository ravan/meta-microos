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

RPM_NAME = "openssl-provider-libp11-0.4.17-1.4.aarch64.rpm"
RPM_HASH = "edf87be1f384a87c8ef26f6938d62c921b2c7f6a9dd8dee24ad39613bd138f1c4d9162058a0d6ed9809e19cfcbfad548fea5feee8ac911bdb81412ccbe7d8e82"

RPROVIDES:${PN} += "openssl-provider-libp11"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3"

inherit rpm
