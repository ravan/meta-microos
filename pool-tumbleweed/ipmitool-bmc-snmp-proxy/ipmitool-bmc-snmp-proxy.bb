SUMMARY = "SNMP configuration to include the BMC's SNMP agent"
DESCRIPTION = "Given a host with BMC, this package would extend system configuration \
of net-snmp to include redirections to BMC based SNMP."
LICENSE = "BSD-3-Clause"

PV = "1.8.19.13.gbe11d94"

RPM_NAME = "ipmitool-bmc-snmp-proxy-1.8.19.13.gbe11d94-5.4.noarch.rpm"
RPM_HASH = "240938afb8714b47bcb8c6a1020b0db421cc72ebe355c6c767aeaa73a469a162fa0685795665f7d59b061101626bba66ee19697887ad7c506658e5ca3aa049e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-ipmitool-bmc-snmp-proxy \
ipmitool-bmc-snmp-proxy"

RDEPENDS:${PN} += "/usr/bin/sh \
ipmitool \
net-snmp"

inherit rpm
