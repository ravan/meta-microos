SUMMARY = "Ceph RBD client base on NBD"
DESCRIPTION = "NBD based client to map Ceph rbd images to local device"
LICENSE = "BSD-3-Clause & BSL-1.0 & CC-BY-SA-3.0 & LGPL-2.1-only & LGPL-3.0-only & GPL-2.0-only & MIT"

PV = "18.2.7"

RPM_NAME = "rbd-nbd-18.2.7-8.1.aarch64.rpm"
RPM_HASH = "05a8d809fb062774180056a2571bd79aba8c53565e4883f3b31de4a209db125cf0315ad996445aa3ba1012880631691854940b32d86c4a34dd151bc7915f64de"

RPROVIDES:${PN} += "rbd-nbd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libceph-common.so.2 \
libgcc-s.so.1 \
libnl-3.so.200 \
libnl-genl-3.so.200 \
librados.so.2 \
librados2 \
librbd.so.1 \
librbd1 \
libstdc++.so.6"

inherit rpm
