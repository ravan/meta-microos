SUMMARY = "SNMP SMI/MIB Parser"
DESCRIPTION = "A pure-Python implementation of SNMP/SMI MIB parsing and conversion library. \
Can produce PySNMP MIB modules."
LICENSE = "BSD-2-Clause"

PV = "1.6.3"

RPM_NAME = "python313-pysmi-1.6.3-1.3.noarch.rpm"
RPM_HASH = "5f31421b685ec848eed4331af2e2b57fdcfee5b1fd38bb777b4965987769841dd14490b1d271c8c11be85f057959e429920ebe7c12d233dc19e5a8448456e22b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pysmi \
python3.13dist-pysmi \
python313-pysmi \
python3dist-pysmi"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-Jinja2 \
python313-ply \
python313-requests"

inherit rpm
