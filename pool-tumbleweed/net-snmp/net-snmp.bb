SUMMARY = "SNMP Daemon"
DESCRIPTION = "Net-SNMP is a suite of applications used to implement SNMP v1, SNMP v2c \
and SNMP v3 using both IPv4 and IPv6. The suite includes: \
 \
- An extensible agent for responding to SNMP queries including built-in \
  support for a wide range of MIB information modules \
- Command-line applications to retrieve and manipulate information from \
  SNMP-capable devices \
- A daemon application for receiving SNMP notifications \
- A library for developing new SNMP applications, with C and Perl APIs \
- A graphical MIB browser. \
 \
This package was originally based on the CMU 2.1.2.1 snmp code. It was \
renamed from cmu-snmp to ucd-snmp in 1995 and later renamed from ucd-snmp \
to net-snmp in November 2000."
LICENSE = "BSD-3-Clause & MIT"

PV = "5.9.5.2"

RPM_NAME = "net-snmp-5.9.5.2-2.4.aarch64.rpm"
RPM_HASH = "7565c42458792a5d7c4c11cb095e58734227146da5c85ca617d895771406f2541330159de2da77b1f70002bc4c9a1c36f9f27a5b1fee624dcdce079855e42754"

RPROVIDES:${PN} += "net-snmp"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/perl \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libm.so.6 \
libncurses.so.6 \
libnetsnmp.so.45 \
libnetsnmpagent.so.45 \
libnetsnmpmibs.so.45 \
libnetsnmptrapd.so.45 \
libtinfo.so.6 \
libwrap.so.0 \
logrotate \
perl-SNMP \
perl-TermReadKey"

inherit rpm
