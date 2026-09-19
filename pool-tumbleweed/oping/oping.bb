SUMMARY = "Multiple Host Ping that supports ICMPv4 and ICMPv6"
DESCRIPTION = "oping is for measuring network latency using ICMP echo requests. It can send \
to and receive packets from multiple hosts in parallel, which is nice for \
monitoring applications. Both IPv4 and IPv6 are supported transparently."
LICENSE = "GPL-2.0-only"

PV = "1.10.0"

RPM_NAME = "oping-1.10.0-2.15.aarch64.rpm"
RPM_HASH = "93c0cec1f9389024890edb4fe1df225d9e1f801b4fbdfd44f1875810f239a3cb3afb936fc0a23948f02666e9c1cdb32386d773cb83ba3c79917479a118851e2a"

RPROVIDES:${PN} += "oping"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
liboping \
liboping.so.0"

inherit rpm
