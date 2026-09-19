SUMMARY = "SNMP support module for rsyslog"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This module provides the ability to send syslog messages as an SNMPv1 & \
v2c traps."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2608.0"

RPM_NAME = "rsyslog-module-snmp-8.2608.0-1.1.aarch64.rpm"
RPM_HASH = "5dc9b5c8c8a2bed363dbe23e91c543a4a4ff1027ecb3ec694b77d5b7f31762d72cf78dbbbf0214dbd09d41f6036bc4c9be33c13ee3f92665df2ddd61f83e27fc"

RPROVIDES:${PN} += "rsyslog-module-snmp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnetsnmp.so.45 \
rsyslog"

inherit rpm
