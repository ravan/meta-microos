SUMMARY = "SNMP monitoring"
DESCRIPTION = "The Simple Network Management Protocol (SNMP) can be used to monitor \
network-attached devices for conditions that warrant administrative attention. \
 \
This package includes the 'check_snmp' plugin for Nagios or Icinga."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "monitoring-plugins-snmp-2.4.0-5.1.aarch64.rpm"
RPM_HASH = "e1c4ea048361cff8fae57403502a93dce7258260aa4c2e00a952fcf0167c37d9008037b3863c0397d7957765d5e2052aaea2f87e62c886df90b1e93f3d1f3f1c"

RPROVIDES:${PN} += "monitoring-plugins-snmp \
nagios-plugins-snmp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
net-snmp"

inherit rpm
