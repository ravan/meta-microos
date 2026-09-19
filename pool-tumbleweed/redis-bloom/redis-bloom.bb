SUMMARY = "Probabilistic data structures for Redis"
DESCRIPTION = "RedisBloom adds Bloom filter, Cuckoo filter, count-min sketch, t-digest and \
top-k data structures to Redis. \
 \
Load it by adding the following to a configuration file below \
/etc/redis/includes: \
 \
    loadmodule /usr/lib64/redis/modules/redisbloom.so"
LICENSE = "AGPL-3.0-only"

PV = "8.10.1"

RPM_NAME = "redis-bloom-8.10.1-1.1.aarch64.rpm"
RPM_HASH = "027bf32d97cc7ae21ba75a67980c331b0e5924815ea8f909398061c28d7cf930abce084c090b195df88f2819c2d820e05facad7c98e78204bd19cd0ef80b2825"

RPROVIDES:${PN} += "redis-bloom \
redisbloom"

RDEPENDS:${PN} += "libc.so.6 \
libclang13 \
libm.so.6 \
redis"

inherit rpm
