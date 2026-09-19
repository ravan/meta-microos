SUMMARY = "A libpcap-based Ethernet packet generator"
DESCRIPTION = "Bit-Twist is a libpcap-based Ethernet packet generator complementing \
tcpdump. It replays traffic captured in .pcap files onto a live \
network. It comes with a trace file editor to allow you to change the \
contents of a trace file. \
 \
A packet generator is useful in simulating networking traffic or \
testing firewall, IDS, and IPS, and troubleshooting various network \
problems."
LICENSE = "GPL-2.0-only"

PV = "4.7"

RPM_NAME = "bittwist-4.7-1.1.aarch64.rpm"
RPM_HASH = "8bd0734aafbd17c3b71035d0c7b3eccf8fc17d65c87451dab1d528d8ce2116c766a5d411f2b80eb84e8909048301671954d23a9191d763e51b95670131348fef"

RPROVIDES:${PN} += "bittwist"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpcap.so.1"

inherit rpm
