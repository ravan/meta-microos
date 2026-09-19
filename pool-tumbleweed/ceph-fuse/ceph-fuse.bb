SUMMARY = "Ceph fuse-based client"
DESCRIPTION = "FUSE based client for Ceph distributed network file system"
LICENSE = "BSD-3-Clause & BSL-1.0 & CC-BY-SA-3.0 & LGPL-2.1-only & LGPL-3.0-only & GPL-2.0-only & MIT"

PV = "18.2.7"

RPM_NAME = "ceph-fuse-18.2.7-8.1.aarch64.rpm"
RPM_HASH = "1c2c567188456a7a59209f78ca06ed5de36ec5d8407aaa527e262a1aaef6f2e4728b2fe97f1db05c251018da0d9e1f6de2ea79bbdd904dc1ca5e2ec2899594fc"

RPROVIDES:${PN} += "ceph-fuse"

RDEPENDS:${PN} += "/usr/bin/python3 \
fuse3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libceph-common.so.2 \
libfuse3.so.4 \
libgcc-s.so.1 \
libstdc++.so.6 \
python3"

inherit rpm
