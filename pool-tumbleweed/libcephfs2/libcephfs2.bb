SUMMARY = "Ceph distributed file system client library"
DESCRIPTION = "Ceph is a distributed network file system designed to provide excellent \
performance, reliability, and scalability. This is a shared library \
allowing applications to access a Ceph distributed file system via a \
POSIX-like interface."
LICENSE = "BSD-3-Clause & BSL-1.0 & CC-BY-SA-3.0 & LGPL-2.1-only & LGPL-3.0-only & GPL-2.0-only & MIT"

PV = "18.2.7"

RPM_NAME = "libcephfs2-18.2.7-8.1.aarch64.rpm"
RPM_HASH = "86acd840c0f946598e5c4f24a69a866469060e1d1cb97ed535f7c0869ae3e2956f09d4a0250085b7b2ccd96002f53616019a031f8c4acbbaa8bcf0172b017e80"

RPROVIDES:${PN} += "libcephfs.so.2 \
libcephfs2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libceph-common.so.2 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
