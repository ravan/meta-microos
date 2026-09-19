SUMMARY = "OpenSSL Development files for ngtcp2"
DESCRIPTION = "OpenSSL as TLS backend development files for use with libngtcp2. \
QUIC protocol."
LICENSE = "MIT"

PV = "1.25.0"

RPM_NAME = "libngtcp2_crypto_ossl-devel-1.25.0-2.1.aarch64.rpm"
RPM_HASH = "8dd58d8429c1baf25dd175bdd5df2c929c3c8c69a44656b535d12653baab27861aa748ec72cf9b32f36dfc9b7b94046f469d071caefbca4e929f5ba2f3b0bce5"

RPROVIDES:${PN} += "libngtcp2-crypto-ossl-devel \
pkgconfig-libngtcp2-crypto-ossl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libngtcp2-crypto-ossl0 \
libngtcp2-devel \
pkgconfig-libngtcp2 \
pkgconfig-openssl"

inherit rpm
