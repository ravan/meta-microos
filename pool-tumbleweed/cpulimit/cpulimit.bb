SUMMARY = "Limit the CPU Usage of a Process"
DESCRIPTION = "LimitCPU is a program to throttle the CPU cycles used by other applications. \
LimitCPU will monitor a process and make sure its CPU usage stays at or \
below a given percentage. This can be used to make sure your system \
has plenty of CPU cycles available for other tasks. It can also be used \
to keep laptops cool in the face of CPU-hungry processes and for limiting \
virtual machines. \
 \
LimitCPU is the direct child of CPUlimit, a creation of Angelo Marletta, \
which can be found at http://cpulimit.sourceforge.net"
LICENSE = "GPL-2.0-or-later"

PV = "3.2"

RPM_NAME = "cpulimit-3.2-1.4.aarch64.rpm"
RPM_HASH = "b146edc323e201b41edea1b40fa5d9ac5cab413f39258b7bbf7a9ad2e694321782a0a9906917e0effd65ee69919c95f55f6d75a8c9716e06225dd0be85030f23"

RPROVIDES:${PN} += "cpulimit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
