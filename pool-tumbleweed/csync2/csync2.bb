SUMMARY = "Cluster synchronization tool"
DESCRIPTION = "Csync2 is a cluster synchronization tool. It can be used to keep files on \
multiple hosts in a cluster in sync. Csync2 can handle complex setups with \
much more than just 2 hosts, handle file deletions and can detect conflicts. \
It is expedient for HA-clusters, HPC-clusters, COWs and server farms."
LICENSE = "GPL-2.0-or-later"

PV = "2.0+git.1600444747.83b3644"

RPM_NAME = "csync2-2.0+git.1600444747.83b3644-3.4.aarch64.rpm"
RPM_HASH = "9de2b7af5af157fc4ce330fa306f2be35d971f724556d9c43ef7de68177ce837953dc90a2a4b0f209e463ff104644dcd951d7010ad0fd23204ddf65d2e61413c"

RPROVIDES:${PN} += "config-csync2 \
csync2"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
hostname \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnutls.so.30 \
librsync.so.2 \
openssl \
sqlite3"

inherit rpm
