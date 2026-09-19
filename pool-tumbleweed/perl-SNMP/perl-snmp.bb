SUMMARY = "Perl5 SNMP Extension Module"
DESCRIPTION = "The Perl5 'SNMP' Extension Module v3.1.0 for the UCD SNMPv3 library."
LICENSE = "GPL-2.0-or-later"

PV = "5.9.5.2"

RPM_NAME = "perl-SNMP-5.9.5.2-2.4.aarch64.rpm"
RPM_HASH = "0ed05795c5c48607d2201eeb5fcf0999018547c7483c3809032d1e9cccea965d00fca02b0dda72130b391cdbdf9f545e0ed631a8262073cc4c27a09401a5c471"

RPROVIDES:${PN} += "perl-MakefileSubs \
perl-NetSNMP--ASN \
perl-NetSNMP--OID \
perl-NetSNMP--TrapReceiver \
perl-NetSNMP--agent \
perl-NetSNMP--agent--Support \
perl-NetSNMP--agent--default-store \
perl-NetSNMP--agent--netsnmp-request-infoPtr \
perl-NetSNMP--default-store \
perl-SNMP \
perl-SNMP--DEBUG-INTERNALS \
perl-SNMP--DEBUGGING \
perl-SNMP--DUMP-PACKET \
perl-SNMP--MIB \
perl-SNMP--MIB--MIB-OPTIONS \
perl-SNMP--MIB--NODE \
perl-SNMP--MIB--REPLACE-NEWER \
perl-SNMP--MIB--SAVE-DESCR \
perl-SNMP--Session \
perl-SNMP--TrapSession \
perl-SNMP--VarList \
perl-SNMP--Varbind"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnetsnmp.so.45 \
libnetsnmpagent.so.45 \
libnetsnmptrapd.so.45 \
net-snmp \
perl-base"

inherit rpm
