SUMMARY = "A C/C++ client library and tools for the memcached server"
DESCRIPTION = "Libmemcached is a C/C++ client library and tools for the memcached server \
(http://memcached.org/). It has been designed to be light on memory \
usage, thread safe, and provide full access to server side methods."
LICENSE = "BSD-3-Clause"

PV = "1.1.4"

RPM_NAME = "libmemcached-1.1.4-4.1.aarch64.rpm"
RPM_HASH = "fc19c89d323391a11b7c850a7818afde1a383e840e9d0c9a0c737fa260323a2a62dbbdbab8e9d26029911de18c56ca9da14d2a5c66b79ffaf89d7f400358ddcd"

RPROVIDES:${PN} += "libmemcached"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libevent-2.1.so.7 \
libgcc-s.so.1 \
libm.so.6 \
libmemcached.so.11 \
libmemcachedutil.so.2 \
libstdc++.so.6"

inherit rpm
