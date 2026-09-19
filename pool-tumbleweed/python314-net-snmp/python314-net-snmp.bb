SUMMARY = "The Python 3 'netsnmp' module for the Net-SNMP"
DESCRIPTION = "The 'netsnmp' module provides a full featured, tri-lingual SNMP (SNMPv3, \
SNMPv2c, SNMPv1) client API. The 'netsnmp' module internals rely on the \
Net-SNMP toolkit library."
LICENSE = "BSD-3-Clause & MIT"

PV = "5.9.5.2"

RPM_NAME = "python314-net-snmp-5.9.5.2-2.4.aarch64.rpm"
RPM_HASH = "d7e79e20d74e21f1e7fd5d05db7b944c5ebfa5d1b4f3bd6bf5c691f3b420c6dc2b981c2f7da751a3765feb4d0429cda566e8b4571944299d31d89ed09f107d80"

RPROVIDES:${PN} += "python3.14dist-netsnmp-python \
python314-net-snmp \
python3dist-netsnmp-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnetsnmp.so.45 \
libsnmp45 \
python-abi"

inherit rpm
