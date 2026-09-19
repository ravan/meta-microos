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

RPM_NAME = "python313-snimpy-1.1.2-1.4.aarch64.rpm"
RPM_HASH = "d9bb40dc96f507458d26434beded87d12ef5afa7474cb41e9c91e9d180ec1fcf78762ae9177697b3dad422f56710b363f38d6e357d126205e3089d7d52b4c3bc"

RPROVIDES:${PN} += "python3-snimpy \
python3.13dist-snimpy \
python313-snimpy \
python3dist-snimpy"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsmi.so.2 \
python-abi \
python313-cffi \
python313-pysnmp \
python313-pysnmpcrypto \
python313-setuptools \
update-alternatives"

inherit rpm
