SUMMARY = "The Python 3 'netsnmp' module for the Net-SNMP"
DESCRIPTION = "The 'netsnmp' module provides a full featured, tri-lingual SNMP (SNMPv3, \
SNMPv2c, SNMPv1) client API. The 'netsnmp' module internals rely on the \
Net-SNMP toolkit library."
LICENSE = "BSD-3-Clause & MIT"

PV = "5.9.5.2"

RPM_NAME = "python313-net-snmp-5.9.5.2-2.4.aarch64.rpm"
RPM_HASH = "2d86c47dd9864751561884d8d4c1ac74fde7edf4acea16dad55a8f2597a0d75186ff9edbae271219bce148bd8cd65362c0cf81bfd71368c7b2d7de266dab476e"

RPROVIDES:${PN} += "python3-net-snmp \
python3.13dist-netsnmp-python \
python313-net-snmp \
python3dist-netsnmp-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnetsnmp.so.45 \
libsnmp45 \
python-abi"

inherit rpm
