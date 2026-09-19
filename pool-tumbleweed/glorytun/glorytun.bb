SUMMARY = "A small, simple and secure VPN"
DESCRIPTION = "Glorytun is a small, simple and secure VPN over MUD. \
MUD (Multipath UDP Deflector) is a secure, multipath network protocol \
over UDP. \
 \
The key features of Glorytun come directly from MUD: \
 * Fast and highly secure \
 * Multipath and failover \
 * Traffic shaping \
 * Path MTU discovery without ICMP"
LICENSE = "BSD-2-Clause"

PV = "0.3.4"

RPM_NAME = "glorytun-0.3.4-1.25.aarch64.rpm"
RPM_HASH = "e2028ff23a1b0dd6cdb7a0060160fd9fbffa58824f3473b120b66949e1867894ae1195d3f42723508b5a2048bad2f839d0200db4393d44a0fce4b85cdbd2b51e"

RPROVIDES:${PN} += "glorytun"

RDEPENDS:${PN} += "iproute2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsodium.so.26"

inherit rpm
