SUMMARY = "Libmemcached is a C/C++ client library and tools for the memcached server"
DESCRIPTION = "Libmemcached is a C/C++ client library and tools for the memcached server \
(http://memcached.org/). It has been designed to be light on memory \
usage, thread safe, and provide full access to server side methods. \
 \
The libmemcachedprotocol library contains functions with interacting with \
the memcached server."
LICENSE = "BSD-3-Clause"

PV = "1.1.4"

RPM_NAME = "libmemcachedprotocol0-1.1.4-4.1.aarch64.rpm"
RPM_HASH = "0566f1116e1c0b422804b972d9f17731c4f57a185883270fa529a8fbd5efa098fc10210045ec2a48523d634eedf603d9e9ee62dc75a4db33bf0d1762cc7f0004"

RPROVIDES:${PN} += "libmemcachedprotocol.so.0 \
libmemcachedprotocol0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
