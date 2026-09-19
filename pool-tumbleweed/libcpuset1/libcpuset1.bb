SUMMARY = "cpuset processor and memory placement library"
DESCRIPTION = "The Cpuset System is a processor and memory placement mechanism that \
enables a system administrator to confine tasks to running certain \
CPUs, and to allocating memory on certain Memory Nodes.  The libcpuset \
library provides a convenient 'C' API to cpusets."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0"

RPM_NAME = "libcpuset1-1.0-37.9.aarch64.rpm"
RPM_HASH = "db639d7f4165ecd160feb56abbcc7c9a1b7a65cd3169eb107c90be9fb741d681527059cea3f693b2bf5422fc29243400f070d7529a18921140764f0c67037784"

RPROVIDES:${PN} += "libcpuset.so.1 \
libcpuset1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbitmask.so.1 \
libc.so.6"

inherit rpm
