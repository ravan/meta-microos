SUMMARY = "Ceph Metadata Server Daemon"
DESCRIPTION = "ceph-mds is the metadata server daemon for the Ceph distributed file system. \
One or more instances of ceph-mds collectively manage the file system \
namespace, coordinating access to the shared OSD cluster."
LICENSE = "BSD-3-Clause & BSL-1.0 & CC-BY-SA-3.0 & LGPL-2.1-only & LGPL-3.0-only & GPL-2.0-only & MIT"

PV = "18.2.7"

RPM_NAME = "ceph-mds-18.2.7-8.1.aarch64.rpm"
RPM_HASH = "cfa221921d7b55d060b02a64360e95e7a70e9c3aa2c9f46379aabf9e7d82892a89d4c63ba266b0c2666b67db5af5a29431c26e7a4d6a07fe934dec79898c32c3"

RPROVIDES:${PN} += "ceph-mds"

RDEPENDS:${PN} += "/usr/bin/sh \
ceph-base \
group-ceph \
ld-linux-aarch64.so.1 \
libc.so.6 \
libceph-common.so.2 \
libgcc-s.so.1 \
liblua5.4.so.5 \
libm.so.6 \
libstdc++.so.6 \
libtcmalloc.so.4 \
user-ceph"

inherit rpm
