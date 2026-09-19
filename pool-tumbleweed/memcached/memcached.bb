SUMMARY = "A high-performance, distributed memory object caching system"
DESCRIPTION = "Memcached is a high-performance, distributed memory object caching \
system, generic in nature, but intended for use in speeding up dynamic \
web applications by alleviating database load."
LICENSE = "BSD-3-Clause"

PV = "1.6.45"

RPM_NAME = "memcached-1.6.45-1.1.aarch64.rpm"
RPM_HASH = "4034b34d2e9a4b906dca49f2a2e9c7a48e81806c0a274013ad829c5427205bc22e6736110f2ce14de2f53ec087ce6476cddd9b4293b5b94944b1dbcf253c5ae0"

RPROVIDES:${PN} += "group-memcached \
memcached \
user-memcached"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/perl \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libevent-2.1.so.7 \
libm.so.6 \
libsasl2.so.3 \
libssl.so.3 \
sysuser-shadow"

inherit rpm
