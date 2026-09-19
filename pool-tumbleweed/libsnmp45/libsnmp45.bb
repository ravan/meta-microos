SUMMARY = "Shared Libraries from net-snmp"
DESCRIPTION = "Net-SNMP is a suite of applications used to implement SNMP v1, SNMP v2c \
and SNMP v3 using both IPv4 and IPv6. The suite includes: \
 \
* An extensible agent for responding to SNMP queries including built-in \
  support for a wide range of MIB information modules \
* Command-line applications to retrieve and manipulate information from \
  SNMP-capable devices \
* A daemon application for receiving SNMP notifications \
* A library for developing new SNMP applications, with C and Perl APIs \
* A graphical MIB browser. \
 \
This package holds the shared libraries from the net-snmp package."
LICENSE = "BSD-3-Clause & MIT"

PV = "5.9.5.2"

RPM_NAME = "libsnmp45-5.9.5.2-2.4.aarch64.rpm"
RPM_HASH = "735cdf7566452ea699d8596c20271a39f68fdaf745c66852d9abd196ac5bcc8f4cb1ad32c2ed713ab3b2e67c1b7d06871d4a342ec89c58655d08d145218412ec"

RPROVIDES:${PN} += "libnetsnmp.so.45 \
libnetsnmpagent.so.45 \
libnetsnmphelpers.so.45 \
libnetsnmpmibs.so.45 \
libnetsnmptrapd.so.45 \
libsnmp.so.45 \
libsnmp45"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libnl-3.so.200 \
libnl-route-3.so.200 \
libperl.so \
librpm.so.10 \
librpmio.so.10 \
libsensors.so.4 \
libssl.so.3 \
libsystemd.so.0 \
libwrap.so.0 \
perl-base \
snmp-mibs"

inherit rpm
