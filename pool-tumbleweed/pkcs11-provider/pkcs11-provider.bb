SUMMARY = "A PKCS#11 provider for OpenSSL 3.0+"
DESCRIPTION = "This is an Openssl 3.x provider to access Hardware or Software Tokens using \
the PKCS#11 Cryptographic Token Interface. \
This code targets version 3.0 of the cryptoki interface but should be backwards \
compatible to previous versions as well."
LICENSE = "Apache-2.0"

PV = "1.0"

RPM_NAME = "pkcs11-provider-1.0-2.2.aarch64.rpm"
RPM_HASH = "179fb1b700b19192a455b81126d7444dbf1f293409628d6ae8926c0b9065e4aa0d46d3a357c0513c0f922421d714afbfd489079ca5e60e06727d366c8a9ec58a"

RPROVIDES:${PN} += "pkcs11-provider"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3"

inherit rpm
