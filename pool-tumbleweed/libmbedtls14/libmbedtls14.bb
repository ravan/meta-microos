SUMMARY = "Transport Layer Security protocol suite"
DESCRIPTION = "mbedtls implements the SSL 3.0, TLS 1.0, 1.1 and 1.2 protocols. It \
supports a number of extensions such as SSL Session Tickets (RFC \
5077), Server Name Indication (SNI) (RFC 6066), Truncated HMAC (RFC \
6066), Max Fragment Length (RFC 6066), Secure Renegotiation (RFC \
5746) and Application Layer Protocol Negotiation (ALPN). It \
understands the RSA, (EC)DH(E)-RSA, (EC)DH(E)-PSK and RSA-PSK key \
exchanges."
LICENSE = "Apache-2.0 | GPL-2.0-or-later"

PV = "2.28.10"

RPM_NAME = "libmbedtls14-2.28.10-5.1.aarch64.rpm"
RPM_HASH = "7e75c66458c3a2688c4b44d759801b60ca652dfa235822231b2865c55202a3ce76af37ea9b32440df62ca59d2fca9ce2d3579edd5b30f4e9e32d4db24623ad22"

RPROVIDES:${PN} += "libmbedtls.so.14 \
libmbedtls14"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmbedcrypto.so.7 \
libmbedx509.so.1 \
libz.so.1"

inherit rpm
