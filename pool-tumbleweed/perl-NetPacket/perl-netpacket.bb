SUMMARY = "Assemble/disassemble network packets at the protocol level"
DESCRIPTION = "'NetPacket' provides a base class for a cluster of modules related to \
decoding and encoding of network protocols. Each 'NetPacket' descendent \
module knows how to encode and decode packets for the network protocol it \
implements. Consult the documentation for the module in question for \
protocol-specific implementation. \
 \
Note that there is no inheritance in the 'NetPacket::' cluster of modules \
other than each protocol module being a 'NetPacket'. This was seen to be \
too restrictive as imposing inheritance relationships (for example between \
the IP, UDP and TCP protocols) would make things like tunneling or other \
unusual situations difficult."
LICENSE = "Artistic-2.0"

PV = "1.8.0"

RPM_NAME = "perl-NetPacket-1.8.0-1.5.noarch.rpm"
RPM_HASH = "7c01074dd7bebcb1e643075830b28a35122acc2b6f8d470b5adb85dcabcccbd6ba9976739fdce38ef2574abc0fa7170ff021ab94fda626a43b73183c7d1e1187"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-NetPacket \
perl-NetPacket--ARP \
perl-NetPacket--Ethernet \
perl-NetPacket--ICMP \
perl-NetPacket--ICMPv6 \
perl-NetPacket--IGMP \
perl-NetPacket--IP \
perl-NetPacket--IPX \
perl-NetPacket--IPv6 \
perl-NetPacket--SLL \
perl-NetPacket--SLL2 \
perl-NetPacket--TCP \
perl-NetPacket--UDP \
perl-NetPacket--USBMon"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Socket \
perl-parent"

inherit rpm
