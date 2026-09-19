SUMMARY = "Rados REST gateway"
DESCRIPTION = "RADOS is a distributed object store used by the Ceph distributed \
storage system.  This package provides a REST gateway to the \
object store that aims to implement a superset of Amazon's S3 \
service as well as the OpenStack Object Storage ('Swift') API."
LICENSE = "BSD-3-Clause & BSL-1.0 & CC-BY-SA-3.0 & LGPL-2.1-only & LGPL-3.0-only & GPL-2.0-only & MIT"

PV = "18.2.7"

RPM_NAME = "ceph-radosgw-18.2.7-8.1.aarch64.rpm"
RPM_HASH = "e1121c02582e133b3fcacb6faa9b29894514b5ef3ba5c2b33b7a47ac25f702dda01a5e2746706fc24b6f0bcb06b177c29e343ca12cab562809d73320644242eb"

RPROVIDES:${PN} += "ceph-radosgw"

RDEPENDS:${PN} += "/usr/bin/sh \
ceph-base \
ld-linux-aarch64.so.1 \
libc.so.6 \
libceph-common.so.2 \
libcrypto.so.3 \
libcurl.so.4 \
libexpat.so.1 \
libgcc-s.so.1 \
libicuuc.so.78 \
libldap.so.2 \
liblua5.4.so.5 \
libm.so.6 \
librados.so.2 \
librados2 \
librgw2 \
libsqlite3.so.0 \
libssl.so.3 \
libstdc++.so.6 \
libtcmalloc.so.4"

inherit rpm
