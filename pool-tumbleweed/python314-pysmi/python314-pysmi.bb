SUMMARY = "SNMP SMI/MIB Parser"
DESCRIPTION = "A pure-Python implementation of SNMP/SMI MIB parsing and conversion library. \
Can produce PySNMP MIB modules."
LICENSE = "BSD-2-Clause"

PV = "1.6.3"

RPM_NAME = "python314-pysmi-1.6.3-1.3.noarch.rpm"
RPM_HASH = "26313965fa3d8b6eb4dfc98b5eaff95293d1e2923bfa625b238e9b141fd7b106d9dc09b810f77015d6df28d4e4b4ff8b0883f51f5cc14bcc823f83b3b373212f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pysmi \
python314-pysmi \
python3dist-pysmi"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-Jinja2 \
python314-ply \
python314-requests"

inherit rpm
