SUMMARY = "Transport Layer Security protocol suite"
DESCRIPTION = "mbedtls implements the SSL 3.0, TLS 1.0, 1.1 and 1.2 protocols. It \
supports a number of extensions such as SSL Session Tickets (RFC \
5077), Server Name Indication (SNI) (RFC 6066), Truncated HMAC (RFC \
6066), Max Fragment Length (RFC 6066), Secure Renegotiation (RFC \
5746) and Application Layer Protocol Negotiation (ALPN). It \
understands the RSA, (EC)DH(E)-RSA, (EC)DH(E)-PSK and RSA-PSK key \
exchanges."
LICENSE = "Apache-2.0 | GPL-2.0-or-later"

PV = "4.2.0"

RPM_NAME = "libmbedtls23-4.2.0-1.2.aarch64.rpm"
RPM_HASH = "5769600c4412ee5b2679417fcc76bcc89f60cc044f394e32fc5bede1d976227ba8b6d3602ee58e358b56a4964ec211b5105fb771a84b1eeec8ee15ef1a31b5bf"

RPROVIDES:${PN} += "libmbedtls.so.23 \
libmbedtls23"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmbedx509.so.9 \
libtfpsacrypto.so.2"

inherit rpm
