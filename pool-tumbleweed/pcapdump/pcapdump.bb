SUMMARY = "Dump packets from the network"
DESCRIPTION = "Command line tool to dump packets from the network. \
 \
pcapdump mimics the very basic features of tcpdump(1) and provides a good \
example of how to use Net::Pcap."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.21"

RPM_NAME = "pcapdump-0.21-1.22.aarch64.rpm"
RPM_HASH = "b236bec63f1133649e6c2dc4b1d668d8de86605d6cc56883f97bbe62ca99860d43a41d54cf305dd27fb79e59534da6213ff55954f68e7d5c73ec2e3fcafc0284"

RPROVIDES:${PN} += "pcapdump"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-Net-Pcap"

inherit rpm
