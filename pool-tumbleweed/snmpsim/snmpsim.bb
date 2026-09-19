SUMMARY = "SNMP Agents simulator"
DESCRIPTION = "SNMP Simulator is a software that would act like a multitude of real \
physical devices from SNMP Manager's point of view. Simulator builds \
and uses a database of physical devices' SNMP footprints to respond \
like their real counterparts do. \
 \
Typical use case for this software starts with recording a snapshot \
of SNMP objects of donor agents into text files. Once you have your \
snapshots at hand, a simulator script could be run over the snapshots \
responding to SNMP queries in the same way as donor SNMP agents did \
at the time of recording. \
 \
Technically, SNMP Simulator is a multi-context SNMP agent. That means \
that it handles multiple sets of managed object all at once. \
Each device is simulated within a dedicated SNMP context."
LICENSE = "BSD-3-Clause"

PV = "0.4.7"

RPM_NAME = "snmpsim-0.4.7-3.3.noarch.rpm"
RPM_HASH = "340c66a0ae5fbb980882515e078c1dd57b1fc03bcc64abb26d9280201f5897d0e37605ea2371ff2ab70756abc1e096787b1f74dba19c9b30678600d148faebfd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-snmpsim \
python3dist-snmpsim \
snmpsim"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-dbm \
python3-pysnmp"

inherit rpm
