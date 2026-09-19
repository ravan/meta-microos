SUMMARY = "DAPL runtime libraries"
DESCRIPTION = "libdat and libdapl provide a userspace RDMA API that supports DAT 2.0 \
specification and IB transport extensions for atomic operations and \
rdma write with immediate data. \
 \
This package contains the runtime libraries. \
 \
The libraries have tracing enabled."
LICENSE = "BSD-3-Clause | GPL-2.0-or-later | CPL-1.0"

PV = "2.1.10"

RPM_NAME = "dapl-debug-libs-2.1.10-9.6.aarch64.rpm"
RPM_HASH = "22e894dac45f79224c1cbe3155f6239595daad6500cfa9e0347ee2c6f5771bbda1e5a10af0986f4f594c391b5cd685f69a99e8bb80e94a4204f2576870f97853"

RPROVIDES:${PN} += "dapl-debug-libs \
dapl2 \
libdat2.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
dapl-debug \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
