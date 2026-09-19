SUMMARY = "Userspace RDMA Connection Manager"
DESCRIPTION = "librdmacm provides a userspace RDMA Communication Management API."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "63.0"

RPM_NAME = "librdmacm1-63.0-1.3.aarch64.rpm"
RPM_HASH = "acb8304a872e3a3dfa35199109cf46931ba7e52b59d2d53de714bccfa98bf80eb1af6d9eaaf3579ecd7ca20c39df9dfa9068de0552604fba62a89ec536ca73fe"

RPROVIDES:${PN} += "librdmacm \
librdmacm.so.1 \
librdmacm1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libibverbs.so.1 \
libnl-3.so.200 \
rdma-core"

inherit rpm
