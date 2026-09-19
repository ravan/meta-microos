SUMMARY = "Implementation of IEEE 802.1ab (LLDP)"
DESCRIPTION = "This implementation provides LLDP sending and reception, supports VLAN \
and includes an SNMP subagent that can interface to an SNMP agent \
through AgentX protocol. \
 \
LLDP is an industry standard protocol designed to supplant proprietary \
Link-Layer protocols such as Extreme EDP (Extreme Discovery Protocol) \
and CDP (Cisco Discovery Protocol). The goal of LLDP is to provide an \
inter-vendor compatible mechanism to deliver Link-Layer notifications \
to adjacent network devices. \
 \
This daemon is also able to deal with CDP, FDP, SONMP and EDP \
protocol. It also handles LLDP-MED extension."
LICENSE = "GPL-2.0-or-later & ISC"

PV = "1.0.22"

RPM_NAME = "lldpd-1.0.22-2.3.aarch64.rpm"
RPM_HASH = "45c1bf2f122df9d1a19bfd69fbf635875e7c28574c1724841accca942acdbb1ee62fc9dd32e921b895591600301279b7b720c9a39a34e1bb0b7d6ac44509aa40"

RPROVIDES:${PN} += "config-lldpd \
lldpd"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libbsd.so.0 \
libc.so.6 \
libcap.so.2 \
libevent-2.1.so.7 \
liblldpctl.so.4 \
libnetsnmp.so.45 \
libnetsnmpagent.so.45 \
libnetsnmpmibs.so.45 \
libreadline.so.8 \
libxml2.so.16 \
pwdutils"

inherit rpm
