SUMMARY = "Out-of-kernel stateless NAT64 implementation"
DESCRIPTION = "TAYGA is an out-of-kernel stateless NAT64 implementation for Linux that uses \
the TUN driver to exchange IPv4 and IPv6 packets with the kernel. It is \
intended to provide production-quality NAT64 service for networks where \
dedicated NAT64 hardware would be overkill."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.5"

RPM_NAME = "tayga-0.9.5-1.5.aarch64.rpm"
RPM_HASH = "25926ed6c4707116de4fa298f95e6cd73ccb5da876eaf1d92dda2b664ff88f7e0bdc4082877300dbf0b585084d7dfff51b11ab1bc49e30438cfea10444a62264"

RPROVIDES:${PN} += "config-tayga \
tayga"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
