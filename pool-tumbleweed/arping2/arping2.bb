SUMMARY = "Layer-2 Ethernet pinger"
DESCRIPTION = "Arping is a util to find out it a specific IP address on the LAN is \
'taken' and what MAC address owns it. It is designed to work on \
unrouted networks and with ICMP-blocking hosts."
LICENSE = "GPL-2.0-or-later"

PV = "2.29"

RPM_NAME = "arping2-2.29-1.3.aarch64.rpm"
RPM_HASH = "29cc0472203e0ad0addc04ddf930d2ce63575ce492ae3a973dd4f908c3726ca42364e75269502eeca9f3b9d06197f8bc50bcacfa06bc9083390007505e13e45e"

RPROVIDES:${PN} += "arping2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libnet.so.9 \
libpcap.so.1"

inherit rpm
