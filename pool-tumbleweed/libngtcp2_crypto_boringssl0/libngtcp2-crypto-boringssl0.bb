SUMMARY = "The ngtcp2 crypto API with BoringSSL as a backend"
DESCRIPTION = "ngtcp2 is an implementation of the QUIC protocol (RFC 9000). \
This package contains the crypto API of ngtcp2, which was built using \
BoringSSL as the cryptographic provider."
LICENSE = "MIT"

PV = "1.25.0"

RPM_NAME = "libngtcp2_crypto_boringssl0-1.25.0-2.1.aarch64.rpm"
RPM_HASH = "e067ba97240973ac0a6425b5b524fc534bc0998918bb79549395704b428252a0c7b9f6fe8c2cbdea2172fdaa293815561c054f2b8a8256cebe8be39cc26b7c74"

RPROVIDES:${PN} += "libngtcp2-crypto-boringssl.so.0 \
libngtcp2-crypto-boringssl0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libboringssl-crypto.so.1 \
libboringssl-ssl.so.1 \
libc.so.6 \
libngtcp2.so.16"

inherit rpm
