SUMMARY = "Ceph fuse-based client"
DESCRIPTION = "FUSE based client to map Ceph rbd images to files"
LICENSE = "BSD-3-Clause & BSL-1.0 & CC-BY-SA-3.0 & LGPL-2.1-only & LGPL-3.0-only & GPL-2.0-only & MIT"

PV = "18.2.7"

RPM_NAME = "rbd-fuse-18.2.7-8.1.aarch64.rpm"
RPM_HASH = "3e768a5d2d67014e38a85cfa1d20e236961b5e3fb657762baed11870c703eadde7f8395d70e1a26b55a315a6d38d88a7d4c25c8c6633be31ef3f9fcf58b5e0ab"

RPROVIDES:${PN} += "rbd-fuse"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libceph-common.so.2 \
libfuse3.so.4 \
libgcc-s.so.1 \
librados.so.2 \
librados2 \
librbd.so.1 \
librbd1 \
libstdc++.so.6"

inherit rpm
