SUMMARY = "The ngtcp2 crypto API with GNUTLS as a backend"
DESCRIPTION = "ngtcp2 is an implementation of the QUIC protocol (RFC 9000). \
This package contains the crypto API of ngtcp2, which was built using \
GNUTLS as the cryptographic provider."
LICENSE = "MIT"

PV = "1.25.0"

RPM_NAME = "libngtcp2_crypto_gnutls8-1.25.0-2.1.aarch64.rpm"
RPM_HASH = "fd05c47f12056eb1f0d42bb11d3634ef8862cc550fff521286d552b2b892e2ef886030a832db98296ff8ef06c2ee7662e475af208fd37eedda1f06b9fe776065"

RPROVIDES:${PN} += "libngtcp2-crypto-gnutls.so.8 \
libngtcp2-crypto-gnutls8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnutls.so.30 \
libngtcp2.so.16"

inherit rpm
