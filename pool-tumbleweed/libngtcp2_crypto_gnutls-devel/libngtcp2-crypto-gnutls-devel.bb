SUMMARY = "GnuTLS Development files for ngtcp2"
DESCRIPTION = "GnuTLS as TLS backend development files for use with libngtcp2."
LICENSE = "MIT"

PV = "1.25.0"

RPM_NAME = "libngtcp2_crypto_gnutls-devel-1.25.0-2.1.aarch64.rpm"
RPM_HASH = "317e35b7c646338251b4ed4bf6a1571001a3ef73cd78f2a45edf02b51f4b64eb33feb2a2ed5ed433e57168921513c9de2850a075c12d2231e7781ca60574874c"

RPROVIDES:${PN} += "libngtcp2-crypto-gnutls-devel \
pkgconfig-libngtcp2-crypto-gnutls"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libngtcp2-crypto-gnutls8 \
libngtcp2-devel \
pkgconfig-gnutls \
pkgconfig-libngtcp2"

inherit rpm
