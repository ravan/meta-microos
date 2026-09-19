SUMMARY = "RADOS distributed object store client library"
DESCRIPTION = "RADOS is a reliable, autonomic distributed object storage cluster \
developed as part of the Ceph distributed storage system. This is a \
shared library allowing applications to access the distributed object \
store using a simple file-like interface."
LICENSE = "BSD-3-Clause & BSL-1.0 & CC-BY-SA-3.0 & LGPL-2.1-only & LGPL-3.0-only & GPL-2.0-only & MIT"

PV = "18.2.7"

RPM_NAME = "librados2-18.2.7-8.1.aarch64.rpm"
RPM_HASH = "83a91f825957118cc26d9f683b2d6133ce65311eb3b04107631dbc122130b2b2ca8e54a9cfb57fc107790515f5eda8ec943f248c3336c05332467916b80807d3"

RPROVIDES:${PN} += "libceph-common.so.2 \
librados-tp.so.2 \
librados.so.2 \
librados2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libibverbs.so.1 \
liblttng-ust.so.1 \
libm.so.6 \
librdmacm.so.1 \
libresolv.so.2 \
libstdc++.so.6 \
libudev.so.1 \
libz.so.1"

inherit rpm
