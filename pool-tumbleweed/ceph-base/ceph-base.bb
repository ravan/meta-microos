SUMMARY = "Ceph Base Package"
DESCRIPTION = "Base is the package that includes all the files shared amongst ceph servers"
LICENSE = "BSD-3-Clause & BSL-1.0 & CC-BY-SA-3.0 & LGPL-2.1-only & LGPL-3.0-only & GPL-2.0-only & MIT"

PV = "18.2.7"

RPM_NAME = "ceph-base-18.2.7-8.1.aarch64.rpm"
RPM_HASH = "f8d1f95b67721111936fe0a7c762d1bb28c82def907d92d0fd11fa43e9754af39298bd43925fc5d2335128e2903d28371400dc4924964022a942572b4de9a886"

RPROVIDES:${PN} += "ceph-base \
ceph-test-/usr/bin/ceph-kvstore-tool \
config-ceph-base \
libceph-crypto-openssl.so \
libceph-ebd-vdo.so \
libceph-lz4.so.2 \
libceph-snappy.so.2 \
libceph-zlib.so.2 \
libceph-zstd.so.2 \
libcls-2pc-queue.so.1 \
libcls-cas.so.1 \
libcls-cephfs.so.1 \
libcls-cmpomap.so.1 \
libcls-fifo.so.1 \
libcls-hello.so.1 \
libcls-journal.so.1 \
libcls-lock.so.1 \
libcls-log.so.1 \
libcls-lua.so.1 \
libcls-numops.so.1 \
libcls-otp.so.1 \
libcls-queue.so.1 \
libcls-rbd.so.1 \
libcls-refcount.so.1 \
libcls-rgw-gc.so.1 \
libcls-rgw.so.1 \
libcls-sdk.so.1 \
libcls-test-remote-reads.so.1 \
libcls-timeindex.so.1 \
libcls-user.so.1 \
libcls-version.so.1 \
libec-clay.so \
libec-isa.so \
libec-jerasure-generic.so \
libec-jerasure-neon.so \
libec-jerasure.so \
libec-lrc.so \
libec-shec-generic.so \
libec-shec-neon.so \
libec-shec.so \
libos-tp.so.1 \
libosd-tp.so.1"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
ceph-common \
findutils \
grep \
group-ceph \
ld-linux-aarch64.so.1 \
libaio.so.1 \
libc.so.6 \
libcap.so.2 \
libceph-common.so.2 \
libcephfs2 \
libcrypto.so.3 \
libgcc-s.so.1 \
liblttng-ust.so.1 \
liblua5.4.so.5 \
liblz4.so.1 \
libm.so.6 \
liboath.so.0 \
librados2 \
librbd1 \
librgw2 \
libsnappy.so.1 \
libstdc++.so.6 \
libtcmalloc.so.4 \
libz.so.1 \
logrotate \
psmisc \
smartmontools \
user-ceph \
util-linux \
which"

inherit rpm
