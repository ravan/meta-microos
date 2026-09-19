SUMMARY = "Ceph daemon for immutable object cache"
DESCRIPTION = "Daemon for immutable object cache."
LICENSE = "BSD-3-Clause & BSL-1.0 & CC-BY-SA-3.0 & LGPL-2.1-only & LGPL-3.0-only & GPL-2.0-only & MIT"

PV = "18.2.7"

RPM_NAME = "ceph-immutable-object-cache-18.2.7-8.1.aarch64.rpm"
RPM_HASH = "075665d3865037a2814dcc7caae732a0a2c98ec67c4b1adeb95cb099ab0294e0be59aa43514b83c708c29a594dc47a6c6218689040688b4d4649fcf18452118b"

RPROVIDES:${PN} += "ceph-immutable-object-cache"

RDEPENDS:${PN} += "/usr/bin/sh \
ceph-base \
ld-linux-aarch64.so.1 \
libc.so.6 \
libceph-common.so.2 \
libgcc-s.so.1 \
librados.so.2 \
librados2 \
libstdc++.so.6"

inherit rpm
