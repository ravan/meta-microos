SUMMARY = "A Library for userspace access to RDMA devices using OS Agnostic DAT APIs"
DESCRIPTION = "Along with the OpenFabrics kernel drivers, libdat and libdapl provide \
a userspace RDMA API that supports DAT 2.0 specification and IB \
transport extensions for atomic operations and rdma write with \
immediate data."
LICENSE = "BSD-3-Clause | GPL-2.0-or-later | CPL-1.0"

PV = "2.1.10"

RPM_NAME = "dapl-debug-2.1.10-9.6.aarch64.rpm"
RPM_HASH = "e91817a800760ad5f15e7af41d5dac54acba777438e6c2aa251adf8192fd14db25c3e57a7012d429db813ad9205b4e6844f7f7ca5ef6295d20be4d8e1f9dcffc"

RPROVIDES:${PN} += "config-dapl-debug \
dapl-debug \
libdaplofa.so.2 \
libdaploscm.so.2 \
libdaploucm.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
coreutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libibverbs.so.1 \
librdmacm.so.1 \
sed"

inherit rpm
