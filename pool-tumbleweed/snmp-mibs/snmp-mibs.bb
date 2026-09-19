SUMMARY = "MIB files from net-snmp"
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
This package holds the MIB files from the net-snmp package."
LICENSE = "BSD-3-Clause & MIT"

PV = "5.9.5.2"

RPM_NAME = "snmp-mibs-5.9.5.2-2.4.aarch64.rpm"
RPM_HASH = "960a0d3568231ea1e30e0cc2aae17816e9bcf25102b5f46e966519a88d2c178eeb87cea88ac5d7b9a10cb7a49a1098c561924cdba9fc3bb91747032aeaec1bd3"

RPROVIDES:${PN} += "snmp-mibs"

RDEPENDS:${PN} += ""

inherit rpm
