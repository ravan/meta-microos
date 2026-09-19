SUMMARY = "Ceph daemon for mirroring RBD images"
DESCRIPTION = "Daemon for mirroring RBD images between Ceph clusters, streaming \
changes asynchronously."
LICENSE = "BSD-3-Clause & BSL-1.0 & CC-BY-SA-3.0 & LGPL-2.1-only & LGPL-3.0-only & GPL-2.0-only & MIT"

PV = "18.2.7"

RPM_NAME = "rbd-mirror-18.2.7-8.1.aarch64.rpm"
RPM_HASH = "86486c2477503d70ff672a75fbc8b254f12ed41ab31a02c7c2c49397a3ddc83c861d104955a01389e28483125e282b7a35dcc42e531b957b4e0e969e2d812fc2"

RPROVIDES:${PN} += "rbd-mirror"

RDEPENDS:${PN} += "/usr/bin/sh \
ceph-base \
ld-linux-aarch64.so.1 \
libc.so.6 \
libceph-common.so.2 \
libcrypto.so.3 \
libcryptsetup.so.12 \
libgcc-s.so.1 \
librados.so.2 \
librados2 \
librbd1 \
libssl.so.3 \
libstdc++.so.6 \
libtcmalloc.so.4"

inherit rpm
