SUMMARY = "Network grep"
DESCRIPTION = "ngrep strives to provide most of GNU grep's common features, applying them \
to the network layer. ngrep is a pcap-aware tool that allows you to specify \
extended regular or hexadecimal expressions to match against data payloads \
of packets. It currently recognizes IPv4/6, TCP, UDP, ICMPv4/6, IGMP and \
Raw across Ethernet, PPP, SLIP, FDDI, Token Ring and null interfaces, and \
understands BPF filter logic in the same fashion as more common packet \
sniffing tools, such as tcpdump and snoop."
LICENSE = "BSD-4-Clause"

PV = "1.49.0"

RPM_NAME = "ngrep-1.49.0-1.4.aarch64.rpm"
RPM_HASH = "c2a9e939267d3dd38b09d78cc1ce288492cd4f0a113c184c6551f6b0fe1c77a5679eb977ad69d439932e929cf63789dc47095e227feaac1a366d0a905950a15d"

RPROVIDES:${PN} += "ngrep"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpcap.so.1 \
libpcre2-8.so.0"

inherit rpm
