SUMMARY = "ARP scanning and fingerprinting tool"
DESCRIPTION = "arp-scan is a command-line tool that uses the ARP protocol to discover and fingerprint IP hosts on the local network."
LICENSE = "GPL-3.0-only & LGPL-2.1-only & ISC"

PV = "1.10.0"

RPM_NAME = "arp-scan-1.10.0-2.4.aarch64.rpm"
RPM_HASH = "2a8df0d64273862e8fa3d0918e0146d779fb296e989ae9bfa26a718a65f3b63655b343296f956c75a314e9c8f2fde90a0e8e71aa9adcc897d6040ffee34751ea"

RPROVIDES:${PN} += "arp-scan \
config-arp-scan"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libpcap.so.1 \
perl--MODULE-COMPAT-5.44.0 \
perl-LWP--Simple"

inherit rpm
