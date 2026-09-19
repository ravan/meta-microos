SUMMARY = "OpenSSL Provider for asymmetric operations with private PKCS#11 keys"
DESCRIPTION = "This package contains a provider module for OpenSSL 3.0, interfacing to \
PKCS#11 for operations with private keys in PKCS#11 tokens."
LICENSE = "Apache-2.0"

PV = "1.0.2"

RPM_NAME = "openssl-pkcs11-sign-provider-1.0.2-1.5.aarch64.rpm"
RPM_HASH = "be7b0b620bbccafeae36b233e5a50311f662f2a20dc670662a66911156476def9437e848569e8768186a79daf85af7f5b5bc3fc62ca4ab0a7a6533e39eb05231"

RPROVIDES:${PN} += "openssl-pkcs11-sign-provider"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
openssl"

inherit rpm
