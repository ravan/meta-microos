SUMMARY = "A tunnel which can improve network quality by using FEC"
DESCRIPTION = "A tunnel which can improve network quality on high-latency and \
lossy links by using Forward Error Correction, for all kinds of \
traffic (TCP/UDP/ICMP). \
 \
When used alone, UDPspeeder improves only the UDP connection. By using \
UDPspeeder and a UDP-based VPN together, any traffic can be improved. \
Currently, OpenVPN/L2TP/ShadowVPN are known to be supported."
LICENSE = "MIT"

PV = "20230206.0"

RPM_NAME = "udpspeeder-20230206.0-1.11.aarch64.rpm"
RPM_HASH = "8fa629b37171d8b4c64de39c4602bd24b7b5e0bf1da9e16b43b94fe3ae473bcab73e8b0f82b406b340cbdf5d4e772f65913ce2186e4ea78ed479582e29a4b36f"

RPROVIDES:${PN} += "udpspeeder"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
