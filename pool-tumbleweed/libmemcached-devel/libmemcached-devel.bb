SUMMARY = "Libmemcached is a C/C++ client library and tools for the memcached server"
DESCRIPTION = "Libmemcached is a C/C++ client library and tools for the memcached server \
(http://memcached.org/). It has been designed to be light on memory \
usage, thread safe, and provide full access to server side methods."
LICENSE = "BSD-3-Clause"

PV = "1.1.4"

RPM_NAME = "libmemcached-devel-1.1.4-4.1.aarch64.rpm"
RPM_HASH = "eb7ea30c81ee953bef7e9ece9b66051208648f3200b363f53bb491c31c7aa86e90047ca21b5f1a49b8593610c9ff988c81218840b295c33d94eb51425e85bc1c"

RPROVIDES:${PN} += "cmake-libmemcached \
libmemcached-devel \
pkgconfig-libmemcached"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cyrus-sasl-devel \
glibc-devel \
libmemcached \
libmemcached11 \
libmemcachedprotocol0 \
libmemcachedutil2 \
pkgconfig-libsasl2"

inherit rpm
