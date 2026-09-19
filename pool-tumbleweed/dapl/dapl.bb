SUMMARY = "A Library for userspace access to RDMA devices using OS Agnostic DAT APIs"
DESCRIPTION = "Along with the OpenFabrics kernel drivers, libdat and libdapl provide \
a userspace RDMA API that supports DAT 2.0 specification and IB \
transport extensions for atomic operations and rdma write with \
immediate data."
LICENSE = "BSD-3-Clause | GPL-2.0-or-later | CPL-1.0"

PV = "2.1.10"

RPM_NAME = "dapl-2.1.10-9.6.aarch64.rpm"
RPM_HASH = "09eab250e2a8e11c5300f6584bc9bdaabc65198a1bebff0dc36fea349187bfb6c327d95ed9cc9ab4be2d216587abbb57315cc81d3dadcfaf07dd31292d750b14"

RPROVIDES:${PN} += "config-dapl \
dapl \
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
