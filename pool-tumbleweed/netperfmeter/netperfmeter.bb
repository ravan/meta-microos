SUMMARY = "Network performance meter for the UDP, TCP, SCTP and DCCP protocols"
DESCRIPTION = "NetPerfMeter is a network performance meter for the UDP, TCP, SCTP \
and DCCP transport protocols over IPv4 and IPv6. It simultaneously \
transmits bidirectional flows to an endpoint and measures the \
resulting flow bandwidths and QoS. The results are written as \
vector and scalar files. \
The vector files can e.g. be used to create plots of the results."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.11"

RPM_NAME = "netperfmeter-2.0.11-1.1.aarch64.rpm"
RPM_HASH = "4bc29f98853250e7005385c6478d4f85e36fd414234e1afc78fc7bd008511dade1cdd4b4aee31821e1bf3c08a411c2dbb80f644cab22a7be25f02d64bffac459"

RPROVIDES:${PN} += "config-netperfmeter \
netperfmeter"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libsctp.so.1 \
libstdc++.so.6"

inherit rpm
