SUMMARY = "Development files from net-snmp"
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
This package holds the development headers, libraries and API documentation \
from the net-snmp package."
LICENSE = "BSD-3-Clause & MIT"

PV = "5.9.5.2"

RPM_NAME = "net-snmp-devel-5.9.5.2-2.4.aarch64.rpm"
RPM_HASH = "1e8e6173723e60b4d0cf8943c96a18f98ff3afe4fa5ad295afa1bbf19d8d308ceae3755206fa7b564c991542c52de4a1416d6ae10a1df51d5eca253a9265bb6b"

RPROVIDES:${PN} += "net-snmp-devel \
pkgconfig-netsnmp \
pkgconfig-netsnmp-agent"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/pkg-config \
/usr/bin/sh \
libnl3-devel \
libsensors4-devel \
libsnmp45 \
perl \
perl-SNMP \
pkgconfig-libssl \
rpm-devel \
tcpd-devel \
zlib-devel"

inherit rpm
