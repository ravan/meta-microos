SUMMARY = "Interface to the pcap(3) LBL packet capture library"
DESCRIPTION = "'Net::Pcap' is a Perl binding to the LBL pcap(3) library and its Win32 \
counterpart, the WinPcap library. Pcap (packet capture) is a portable API \
to capture network packet: it allows applications to capture packets at \
link-layer, bypassing the normal protocol stack. It also provides features \
like kernel-level packet filtering and access to internal statistics. \
 \
Common applications include network statistics collection, security \
monitoring, network debugging, etc."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.21"

RPM_NAME = "perl-Net-Pcap-0.21-1.22.aarch64.rpm"
RPM_HASH = "d47997fade2f048c235da30719e8e252bfffefb915729b9fe6dfa58fefa77c241ea9636d962704e8198c634506715e93a55216402c4e1f5ec18dfa71e0f1fbd5"

RPROVIDES:${PN} += "perl-Net--Pcap \
perl-Net-Pcap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpcap.so.1 \
perl--MODULE-COMPAT-5.44.0 \
perl-Data--Hexdumper \
perl-NetPacket"

inherit rpm
