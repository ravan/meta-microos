SUMMARY = "InfiniBand Communication Manager Assistant"
DESCRIPTION = "The ibacm daemon helps reduce the load of managing path record lookups on \
large InfiniBand fabrics by providing a user space implementation of what \
is functionally similar to an ARP cache.  The use of ibacm, when properly \
configured, can reduce the SA packet load of a large IB cluster from O(n^2) \
to O(n).  The ibacm daemon is started and normally runs in the background, \
user applications need not know about this daemon as long as their app \
uses librdmacm to handle connection bring up/tear down.  The librdmacm \
library knows how to talk directly to the ibacm daemon to retrieve data."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "63.0"

RPM_NAME = "ibacm-63.0-1.3.aarch64.rpm"
RPM_HASH = "17992f98210b9a81a3890d66dfc7115ae67cc4e7a9e733f0101fd45f6bb972a8d94c9b8d2106298502b00964fc5e2bafd7a8c4cbdeceab3e074e80313d1e0a2d"

RPROVIDES:${PN} += "config-ibacm \
ibacm \
libibacmp.so \
libibacmp1"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libibumad.so.3 \
libibverbs.so.1 \
libnl-3.so.200 \
libnl-route-3.so.200 \
libsystemd.so.0 \
rdma-core \
systemd"

inherit rpm
