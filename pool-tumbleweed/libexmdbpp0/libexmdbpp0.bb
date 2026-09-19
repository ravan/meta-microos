SUMMARY = "A C++ implementation of the exmdb wire protocol"
DESCRIPTION = "The library provides a C++ API and implementation for constructing \
exmdb protocol requests and responses and conversing with a server."
LICENSE = "AGPL-3.0-or-later"

PV = "1.11.0.58baa16"

RPM_NAME = "libexmdbpp0-1.11.0.58baa16-2.7.aarch64.rpm"
RPM_HASH = "c7704bddbf40efb7a5c73c306ec231dbc9827aa2d83ae6b24cd1fb4d143759f2ae5be12e893e88fbc9405979818f381dac31afa7a86801c5848e37128a3e0311"

RPROVIDES:${PN} += "libexmdbpp.so.0 \
libexmdbpp0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
