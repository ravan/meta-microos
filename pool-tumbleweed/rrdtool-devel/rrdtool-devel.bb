SUMMARY = "RRDtool header files"
DESCRIPTION = "RRD stands for Round Robin Database. RRD is a system to store and \
display time-series data (i.e. network bandwidth, machine-room temperature, \
server load average). This package allow you to build programs making \
use of the library."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.11.0"

RPM_NAME = "rrdtool-devel-1.11.0-1.1.aarch64.rpm"
RPM_HASH = "b572ad03a1c6a0f283de6248433d045145dc21287ccfba477b9ee42a63a008a20be5835afc18ba7101f6283a8d62ccc10486a4fd1501be15589d0e95c21cfda3"

RPROVIDES:${PN} += "pkgconfig-librrd \
rrdtool-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librrd8"

inherit rpm
