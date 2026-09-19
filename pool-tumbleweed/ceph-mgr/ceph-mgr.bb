SUMMARY = "Ceph Manager Daemon"
DESCRIPTION = "ceph-mgr enables python modules that provide services (such as the REST \
module derived from Calamari) and expose CLI hooks.  ceph-mgr gathers \
the cluster maps, the daemon metadata, and performance counters, and \
exposes all these to the python modules."
LICENSE = "BSD-3-Clause & BSL-1.0 & CC-BY-SA-3.0 & LGPL-2.1-only & LGPL-3.0-only & GPL-2.0-only & MIT"

PV = "18.2.7"

RPM_NAME = "ceph-mgr-18.2.7-8.1.aarch64.rpm"
RPM_HASH = "442e21308458c5fd46ee3856c112e729c2b302776798323dcd468a645fe547591bae6f159552c6cb2fab1a584d6b19f3d9d9c2a4bbeae1fd171c97f220b6d5e6"

RPROVIDES:${PN} += "ceph-mgr"

RDEPENDS:${PN} += "/usr/bin/sh \
ceph-base \
ceph-mgr-modules-core \
group-ceph \
ld-linux-aarch64.so.1 \
libc.so.6 \
libceph-common.so.2 \
libcephsqlite \
libcephsqlite.so \
libgcc-s.so.1 \
libpython3.13.so.1.0 \
libsqlite3.so.0 \
libstdc++.so.6 \
libtcmalloc.so.4 \
user-ceph"

inherit rpm
