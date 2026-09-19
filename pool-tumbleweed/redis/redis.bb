SUMMARY = "Persistent key-value database"
DESCRIPTION = "redis is an advanced key-value store. It is similar to memcached but the dataset \
is not volatile, and values can be strings, exactly like in memcached, \
but also lists, sets, and ordered sets. All this data types can be manipulated \
with atomic operations to push/pop elements, add/remove elements, perform server \
side union, intersection, difference between sets, and so forth. Redis supports \
different kind of sorting abilities."
LICENSE = "AGPL-3.0-only"

PV = "8.10.1"

RPM_NAME = "redis-8.10.1-1.1.aarch64.rpm"
RPM_HASH = "890b3e8ed26b514995d35cad8788d904d7f81f6674309838497293ccbb47c2e2775c4b4b21fb41c91465cf39c12053fa7a044651695f8753eafc2342cd4da4ff"

RPROVIDES:${PN} += "config-redis \
group-redis \
redis \
user-redis"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libm.so.6 \
libssl.so.3 \
libsystemd.so.0 \
sysuser-shadow"

inherit rpm
