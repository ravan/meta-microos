SUMMARY = "The ngtcp2 crypto API with OpenSSL as a backend"
DESCRIPTION = "ngtcp2 is an implementation of the QUIC protocol (RFC 9000). \
This package contains the crypto API of ngtcp2, which was built using \
OpenSSL as the cryptographic provider."
LICENSE = "MIT"

PV = "1.25.0"

RPM_NAME = "libngtcp2_crypto_ossl0-1.25.0-2.1.aarch64.rpm"
RPM_HASH = "abeebac69eee0cec8c29e9919396180556e96fee8a6b5678dfe76629675c7ee5359acfcc77478e941d5ca196b480e1ef6222ad961335b9afcaae8476d358b841"

RPROVIDES:${PN} += "libngtcp2-crypto-ossl.so.0 \
libngtcp2-crypto-ossl0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libngtcp2.so.16 \
libssl.so.3"

inherit rpm
