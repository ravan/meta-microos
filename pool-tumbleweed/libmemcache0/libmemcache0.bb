SUMMARY = "A client library for memcached"
DESCRIPTION = "libmemcache implements a client for the superior memcached from Danga \
Interactive. \
 \
This package holds the shared libraries from libmemcache."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.4.0.rc2"

RPM_NAME = "libmemcache0-1.4.0.rc2-153.9.aarch64.rpm"
RPM_HASH = "40b856e4904145cbce60f00ad8d5fd4b3970574a07307ebe863e1f7f510e0e99e830edecb47f7a14f2edacdc4d1befd2e4f98cc13a097685381e888b267ba709"

RPROVIDES:${PN} += "libmemcache.so.0 \
libmemcache0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
