SUMMARY = "Multiple Host Ping that supports ICMPv4 and ICMPv6"
DESCRIPTION = "Net::Oping is for measuring network latency using ICMP echo requests. \
It can send to and receive packets from multiple hosts in parallel, which is \
nice for monitoring applications. Both IPv4 and IPv6 are supported \
transparently."
LICENSE = "LGPL-2.1-only"

PV = "1.10.0"

RPM_NAME = "perl-Net-Oping-1.10.0-2.15.aarch64.rpm"
RPM_HASH = "153f96c10627f19288f1e90ad4f83f7e3cc27ef66cd9cd0aebd08cf29c4100a5ae3f7016bc64f74b1affff3049939521ee0c0d258b8fcf42221d6b8110fe413f"

RPROVIDES:${PN} += "perl-Net--Oping \
perl-Net-Oping"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl"

inherit rpm
