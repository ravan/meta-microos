SUMMARY = "System-Wide Profiler for Linux Systems"
DESCRIPTION = "OProfile is a system-wide profiler for Linux systems, capable of \
profiling all running code at low overhead. OProfile is released under \
the GNU GPL. \
 \
This package contains the library needed at runtime when profiling JITed code \
from supported virtual machines."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.4.0"

RPM_NAME = "libopagent1-1.4.0-5.2.aarch64.rpm"
RPM_HASH = "c0b7fdb3b5b602a9c1bd76aea33ad353c045e38dd21ff7fe7e16456b23df4cce43acc664359eaf01d321ec1a813bb671f1465260aa7744f4398c2be09c326123"

RPROVIDES:${PN} += "libopagent.so.1 \
libopagent1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsframe.so.2 \
libz.so.1 \
libzstd.so.1"

inherit rpm
