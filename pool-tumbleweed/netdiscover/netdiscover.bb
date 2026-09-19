SUMMARY = "A network address discovering/monitoring tool"
DESCRIPTION = "Netdiscover is an active/passive address reconnaissance tool, mainly developed \
for those wireless networks without dhcp server, when you are wardriving. It \
can be also used on hub/switched networks. \
 \
Built on top of libnet and libpcap, it can passively detect online hosts, or \
search for them, by actively sending arp requests, it can also be used to \
inspect your network arp traffic, and find network addresses using auto scan \
mode, which will scan for common local networks."
LICENSE = "GPL-3.0-or-later"

PV = "0.21"

RPM_NAME = "netdiscover-0.21-1.5.aarch64.rpm"
RPM_HASH = "d572d5dbeb3ccff08fe892481a86067860e5403b8ca943da39f94787394f7ac80c488b4af191d5202391eb2a7b3190b80e5e5a6728b4f824ecf438652e4ea7e5"

RPROVIDES:${PN} += "netdiscover"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpcap.so.1"

inherit rpm
