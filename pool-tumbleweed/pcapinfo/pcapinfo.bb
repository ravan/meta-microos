SUMMARY = "Prints detailed information about the network devices"
DESCRIPTION = "pcapinfo prints detailed information about the network devices and Pcap library \
available on the current host."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.21"

RPM_NAME = "pcapinfo-0.21-1.22.aarch64.rpm"
RPM_HASH = "4b9c88813dd9bd94e3514b56682a935d98e3504d6621c914044dbe3dfbc1f7a382e3b51afa9ecdf23650a861da4c94032df7f1c9343b70332e74343b2a60e1e8"

RPROVIDES:${PN} += "pcapinfo"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-Net-Pcap"

inherit rpm
