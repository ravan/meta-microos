SUMMARY = "Transport Layer Security protocol suite"
DESCRIPTION = "mbedtls implements the SSL 3.0, TLS 1.0, 1.1 and 1.2 protocols. It \
supports a number of extensions such as SSL Session Tickets (RFC \
5077), Server Name Indication (SNI) (RFC 6066), Truncated HMAC (RFC \
6066), Max Fragment Length (RFC 6066), Secure Renegotiation (RFC \
5746) and Application Layer Protocol Negotiation (ALPN). It \
understands the RSA, (EC)DH(E)-RSA, (EC)DH(E)-PSK and RSA-PSK key \
exchanges."
LICENSE = "Apache-2.0 | GPL-2.0-or-later"

PV = "3.6.7"

RPM_NAME = "libmbedtls21-3.6.7-1.2.aarch64.rpm"
RPM_HASH = "2b1988028792fe39f63174a733bcf4161eb8c9432ea0db1f3acc23726d3d8a27057e5e7f5fe606d16dcc757c1877140e56ca90a990703016d95c4ac937d9b436"

RPROVIDES:${PN} += "libmbedtls.so.21 \
libmbedtls21"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmbedcrypto.so.16 \
libmbedx509.so.7"

inherit rpm
