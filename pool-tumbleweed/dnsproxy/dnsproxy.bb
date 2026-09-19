SUMMARY = "A DNS proxy server"
DESCRIPTION = "A DNS proxy server that supports numerous protocols, including \
DNS-over-TLS, DNS-over-HTTPS, DNSCrypt, and DNS-over-QUIC. Moreover, \
it can work as a DNS-over-HTTPS, DNS-over-TLS or DNS-over-QUIC \
server."
LICENSE = "Apache-2.0"

PV = "0.75.0"

RPM_NAME = "dnsproxy-0.75.0-1.10.aarch64.rpm"
RPM_HASH = "50dd4a66f0f43e424a10e56e79288eb5110305d0b70f9c3ac8610ad4710fee5cbaf20e57425abd479459f775719c21dbee85e1f1062e4308fd16a2b39f22defa"

RPROVIDES:${PN} += "dnsproxy"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
