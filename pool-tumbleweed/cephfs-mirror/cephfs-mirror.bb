SUMMARY = "Ceph daemon for mirroring CephFS snapshots"
DESCRIPTION = "Daemon for mirroring CephFS snapshots between Ceph clusters."
LICENSE = "BSD-3-Clause & BSL-1.0 & CC-BY-SA-3.0 & LGPL-2.1-only & LGPL-3.0-only & GPL-2.0-only & MIT"

PV = "18.2.7"

RPM_NAME = "cephfs-mirror-18.2.7-8.1.aarch64.rpm"
RPM_HASH = "7f15cef3ef16eae5a7add83df4ddd31076b3a174dbaa47eec4cdfcc3af6b92bfed0357320279335ba239b8aa6e7650a7f522e13e470dc0283b4b74bbebab06a3"

RPROVIDES:${PN} += "cephfs-mirror"

RDEPENDS:${PN} += "/usr/bin/sh \
ceph-base \
ld-linux-aarch64.so.1 \
libc.so.6 \
libceph-common.so.2 \
libcephfs.so.2 \
libcephfs2 \
libgcc-s.so.1 \
librados.so.2 \
librados2 \
libstdc++.so.6 \
libtcmalloc.so.4"

inherit rpm
