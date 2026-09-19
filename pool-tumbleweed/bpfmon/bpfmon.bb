SUMMARY = "Traffic monitor for BPF expression/iptables rule"
DESCRIPTION = "While tcpdump shows what packets are going through the \
network, bpfmon will show how much in terms \
of bytes per second and packets per second in a \
nice pseudo-graphical terminal interface. \
 \
bpfmon also supports monitoring an iptables rule that \
is selected by command line option or selected from a \
menu."
LICENSE = "GPL-2.0-or-later"

PV = "2.53"

RPM_NAME = "bpfmon-2.53-1.8.aarch64.rpm"
RPM_HASH = "c7170b45c4f9df1d2ecdbdaebf1c258ebd0d8d4693ef66fca54060565320bf0b7b68e762f5ece96b4e304a0407b66241f5723a94a32ca5486382c12edefa8346"

RPROVIDES:${PN} += "bpfmon"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpcap.so.1 \
libyascreen.so.0"

inherit rpm
