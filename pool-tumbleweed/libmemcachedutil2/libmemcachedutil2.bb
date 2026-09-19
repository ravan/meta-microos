SUMMARY = "Libmemcached is a C/C++ client library and tools for the memcached server"
DESCRIPTION = "Libmemcached is a C/C++ client library and tools for the memcached server \
(http://memcached.org/). It has been designed to be light on memory \
usage, thread safe, and provide full access to server side methods. \
 \
The libmemcachedutil library contains utility functions used by \
libmemcached."
LICENSE = "BSD-3-Clause"

PV = "1.1.4"

RPM_NAME = "libmemcachedutil2-1.1.4-4.1.aarch64.rpm"
RPM_HASH = "78d91713c2c5f8eb2d7621724d1cbd01353ab46dc421c4198ca0de5c790cb276114b5df1cb8da997ec2f4135719c84ab332e3476bce2f5ab7080fc0980a9a984"

RPROVIDES:${PN} += "libhashkit.so.2 \
libmemcachedutil.so.2 \
libmemcachedutil2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmemcached.so.11 \
libstdc++.so.6"

inherit rpm
