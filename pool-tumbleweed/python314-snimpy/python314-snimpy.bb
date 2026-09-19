SUMMARY = "Interactive SNMP tool"
DESCRIPTION = "Snimpy is a Python-based tool providing a simple interface to build \
SNMP query. You can either use Snimpy interactively through its console \
(derived from Python own console or from IPython_ if available) or write \
Snimpy scripts which are just Python scripts with some global variables \
available. \
 \
Snimpy is aimed at being the more Pythonic possible. You should forget \
that you are doing SNMP requests. Snimpy will rely on MIB to hide SNMP \
details. Here are some 'features': \
 \
 * MIB parser based on libsmi  (through CFFI) \
 * SNMP requests are handled by PySNMP (SNMPv1, SNMPv2 and SNMPv3 \
   support) \
 * scalars are just attributes of your session object \
 * columns are like a Python dictionary and made available as an \
   attribute \
 * getting an attribute is like issuing a GET method \
 * setting an attribute is like issuing a SET method \
 * iterating over a table is like using GETNEXT \
 * when something goes wrong, you get an exception"
LICENSE = "ISC"

PV = "1.1.2"

RPM_NAME = "python314-snimpy-1.1.2-1.4.aarch64.rpm"
RPM_HASH = "4dca9943617f4b31b5a8237862cd73be30604395e623e08bbe785197c77d3c5a7b6bbd31bb9fd6999e81a4d5d8cacafc102c9fb4c61795439c5894b68073b7cf"

RPROVIDES:${PN} += "python3.14dist-snimpy \
python314-snimpy \
python3dist-snimpy"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsmi.so.2 \
python-abi \
python314-cffi \
python314-pysnmp \
python314-pysnmpcrypto \
python314-setuptools \
update-alternatives"

inherit rpm
