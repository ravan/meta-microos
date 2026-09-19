SUMMARY = "Ceph Monitor Daemon"
DESCRIPTION = "ceph-mon is the cluster monitor daemon for the Ceph distributed file \
system. One or more instances of ceph-mon form a Paxos part-time \
parliament cluster that provides extremely reliable and durable storage \
of cluster membership, configuration, and state."
LICENSE = "BSD-3-Clause & BSL-1.0 & CC-BY-SA-3.0 & LGPL-2.1-only & LGPL-3.0-only & GPL-2.0-only & MIT"

PV = "18.2.7"

RPM_NAME = "ceph-mon-18.2.7-8.1.aarch64.rpm"
RPM_HASH = "e3ccf97df8da879810ec00abfa8f1dd853a175da2bf9a430939831e1660f3ed0b0fa5236623f400a233246fd7fa7bc88c1de2b3cca570a2a1865aa496c73257a"

RPROVIDES:${PN} += "ceph-mon \
ceph-test-/usr/bin/ceph-monstore-tool"

RDEPENDS:${PN} += "/usr/bin/sh \
ceph-base \
group-ceph \
ld-linux-aarch64.so.1 \
libc.so.6 \
libceph-common.so.2 \
libgcc-s.so.1 \
liblz4.so.1 \
libm.so.6 \
libsnappy.so.1 \
libstdc++.so.6 \
libtcmalloc.so.4 \
libz.so.1 \
user-ceph"

inherit rpm
