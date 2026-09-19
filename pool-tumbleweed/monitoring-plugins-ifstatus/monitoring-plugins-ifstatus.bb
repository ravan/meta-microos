SUMMARY = "Monitor operational status network interfaces"
DESCRIPTION = "This plugin monitors operational status of each network interface on the target \
host."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "monitoring-plugins-ifstatus-2.4.0-5.1.aarch64.rpm"
RPM_HASH = "a4155baacd684d4aed1be52adf4455d3b54149ab213450ee506c0c46170fbc8f50240ad284cdcf8910491d18ed6fb4cd3fecc1ee7f08ab1776454e1298562479"

RPROVIDES:${PN} += "monitoring-plugins-ifstatus \
nagios-plugins-ifstatus"

RDEPENDS:${PN} += "/usr/bin/perl \
monitoring-plugins-common \
perl-Net--SNMP"

inherit rpm
