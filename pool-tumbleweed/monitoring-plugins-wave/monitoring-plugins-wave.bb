SUMMARY = "Check wave signal strength"
DESCRIPTION = "Check the wave signal strength via SNMP."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "monitoring-plugins-wave-2.4.0-5.1.aarch64.rpm"
RPM_HASH = "2d9f579a36d3f6ce323a3f3ed8986b5c686f94c45e2e20eaedfbd019147cca9b473fbdd2cc29e782784dd1f2c3f6dfb176ce7d00310b26a8260bec7b4934fd10"

RPROVIDES:${PN} += "monitoring-plugins-wave \
nagios-plugins-wave"

RDEPENDS:${PN} += "/usr/bin/perl \
monitoring-plugins-common \
net-snmp \
perl"

inherit rpm
