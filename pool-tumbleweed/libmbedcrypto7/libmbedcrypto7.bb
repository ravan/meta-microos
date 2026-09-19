SUMMARY = "Cryptographic base library for mbedtls"
DESCRIPTION = "This subpackage of mbedtls contains a library that exposes \
cryptographic ciphers, hashes, algorithms and format support such as \
AES, MD5, SHA, Elliptic Curves, BigNum, PKCS, ASN.1, BASE64."
LICENSE = "Apache-2.0 | GPL-2.0-or-later"

PV = "2.28.10"

RPM_NAME = "libmbedcrypto7-2.28.10-5.1.aarch64.rpm"
RPM_HASH = "26f6e79dc55fb8d24524f7885c6cb10e3d641af291ec67177e19d87118ebf4acb963dd02c4947a6f9e2fe87b0d6c057534d129c7706123b8d9ce1c68bdb6c48d"

RPROVIDES:${PN} += "libmbedcrypto.so.7 \
libmbedcrypto7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
