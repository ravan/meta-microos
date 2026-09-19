SUMMARY = "Query, secondary index and full-text search for Redis"
DESCRIPTION = "RediSearch turns Redis into a document database with a secondary index, \
full-text search, vector similarity search and aggregation. \
 \
Load it by adding the following to a configuration file below \
/etc/redis/includes: \
 \
    loadmodule /usr/lib64/redis/modules/redisearch.so"
LICENSE = "AGPL-3.0-only"

PV = "8.10.1"

RPM_NAME = "redis-search-8.10.1-1.1.aarch64.rpm"
RPM_HASH = "f00af163ead29872a6c494f097b0ef15a2801d4e803d5ef341f2ace157533b3000d88f3f4fa7a582f47517d9cd4410ae3e86c4ddb7f811b39931960dd6dd9d2c"

RPROVIDES:${PN} += "redis-search \
redisearch"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libclang13 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libssl.so.3 \
libstdc++.so.6 \
redis"

inherit rpm
