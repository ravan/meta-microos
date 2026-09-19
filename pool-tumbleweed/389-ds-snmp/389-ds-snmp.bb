SUMMARY = "SNMP Agent for 389 Directory Server"
DESCRIPTION = "SNMP Agent for the 389 Directory Server base package."
LICENSE = "GPL-3.0-or-later & MPL-2.0"

PV = "3.3.1+8c2711bd6"

RPM_NAME = "389-ds-snmp-3.3.1+8c2711bd6-1.1.aarch64.rpm"
RPM_HASH = "073d404578def5adf2ea4bd701c30486f307b4a501c91b7f18db2f1feffd721f110b2aefa1cff85623900e41e583406f05743f5e464dc97f303dcc0085f8bc4a"

RPROVIDES:${PN} += "389-ds-snmp \
config-389-ds-snmp"

RDEPENDS:${PN} += "/usr/bin/sh \
389-ds \
ld-linux-aarch64.so.1 \
libc.so.6 \
libldap.so.2 \
libnetsnmp.so.45 \
libnetsnmpagent.so.45 \
libnspr4.so"

inherit rpm
