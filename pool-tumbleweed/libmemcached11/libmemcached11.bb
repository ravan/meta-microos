SUMMARY = "Libmemcached is a C/C++ client library and tools for the memcached server"
DESCRIPTION = "Libmemcached is a C/C++ client library and tools for the memcached server \
(http://memcached.org/). It has been designed to be light on memory \
usage, thread safe, and provide full access to server side methods."
LICENSE = "BSD-3-Clause"

PV = "1.1.4"

RPM_NAME = "libmemcached11-1.1.4-4.1.aarch64.rpm"
RPM_HASH = "3706c3bd05083b661fd7760b3a45d37b15d2a4700d70e76cca6bebebd2870f2d0eaee92dca528dbffc15f93c3193dd8bf8c531bbc50be880b1b3aad9f69ed58f"

RPROVIDES:${PN} += "libmemcached.so.11 \
libmemcached11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhashkit.so.2 \
libsasl2.so.3 \
libstdc++.so.6"

inherit rpm
