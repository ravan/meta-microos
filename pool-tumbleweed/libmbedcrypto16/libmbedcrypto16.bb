SUMMARY = "Cryptographic base library for mbedtls"
DESCRIPTION = "This subpackage of mbedtls contains a library that exposes \
cryptographic ciphers, hashes, algorithms and format support such as \
AES, MD5, SHA, Elliptic Curves, BigNum, PKCS, ASN.1, BASE64."
LICENSE = "Apache-2.0 | GPL-2.0-or-later"

PV = "3.6.7"

RPM_NAME = "libmbedcrypto16-3.6.7-1.2.aarch64.rpm"
RPM_HASH = "b334767970634dcb3f2a5f7873eb104a5eeeed596c5cccf74016c21d790839b97c2cde4c20e646f6cdccdfe73c397b3b7756d445fa6c73e7ecf8f6072bd7eea9"

RPROVIDES:${PN} += "libmbedcrypto.so.16 \
libmbedcrypto16"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
