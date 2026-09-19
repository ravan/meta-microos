SUMMARY = "Multicast Server and Client application"
DESCRIPTION = "Simple multicast Server/Client application. \
Supports: \
 \
 * IPv4 AND IPv6 \
 * Multicast Server \
 * Multicast client \
 * Source Specific Multicast client"
LICENSE = "GPL-3.0-or-later"

PV = "0.2.5.2"

RPM_NAME = "simple-multicast-0.2.5.2-1.4.aarch64.rpm"
RPM_HASH = "2555b714f28f17124d1dd2d0ab8b5abd9b6a499a48eda20f140b51d9e293a291cd2de1eaf26ed773fdae7590c361172e3176c5ba625f022d34b01eacfcaa4add"

RPROVIDES:${PN} += "simple-multicast"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
