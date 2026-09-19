SUMMARY = "Tool for displaying/troubleshooting SIP signaling on IP networks"
DESCRIPTION = "Sipgrep is a pcap-aware tool command line tool to sniff, capture, \
display and troubleshoot SIP signaling over IP networks. The user can \
specify extended regular expressions matching against SIP headers."
LICENSE = "GPL-3.0-or-later"

PV = "2.2.4"

RPM_NAME = "sipgrep-2.2.4-1.1.aarch64.rpm"
RPM_HASH = "e791dc6d622258c29c5e7adcec0ff0e57eaa9bec3a33116a5e0eadbfa08d1b0c77e51e536e7e9a288bdcb6e6e2547f61b84f7e3d3fdb596656d7138a016aa5b0"

RPROVIDES:${PN} += "sipgrep"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpcap.so.1 \
libpcre2-8.so.0"

inherit rpm
