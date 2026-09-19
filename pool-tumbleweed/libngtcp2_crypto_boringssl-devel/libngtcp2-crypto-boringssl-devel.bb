SUMMARY = "BoringSSL Development files for ngtcp2"
DESCRIPTION = "BoringSSL as TLS backend development files for use with libngtcp2."
LICENSE = "MIT"

PV = "1.25.0"

RPM_NAME = "libngtcp2_crypto_boringssl-devel-1.25.0-2.1.aarch64.rpm"
RPM_HASH = "9e0f32adbdf9b917d4cfea5032152b019dc360a31e0e9a934acd8129dc2b2286d93c86b003450d556f2875ec1e1112467714d061c8ca7c4496226200a1cec70a"

RPROVIDES:${PN} += "libngtcp2-crypto-boringssl-devel \
pkgconfig-libngtcp2-crypto-boringssl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
boringssl-devel \
libngtcp2-crypto-boringssl0 \
libngtcp2-devel \
pkgconfig-libngtcp2"

inherit rpm
