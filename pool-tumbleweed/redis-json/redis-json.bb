SUMMARY = "JSON data type for Redis"
DESCRIPTION = "RedisJSON adds a native JSON data type to Redis, letting JSON documents be \
stored, updated and queried down to individual paths. \
 \
Load it by adding the following to a configuration file below \
/etc/redis/includes: \
 \
    loadmodule /usr/lib64/redis/modules/rejson.so"
LICENSE = "AGPL-3.0-only"

PV = "8.10.1"

RPM_NAME = "redis-json-8.10.1-1.1.aarch64.rpm"
RPM_HASH = "19d5771c3141c337e5a686471701d127abb5981511ed9bc456a6d1e9647ec7812df30c3a4bd0db2af08ec85aaf2acd1f41746bb88d3122978bc04f1568bbfae9"

RPROVIDES:${PN} += "redis-json \
redisjson"

RDEPENDS:${PN} += "libc.so.6 \
libclang13 \
libgcc-s.so.1 \
libm.so.6 \
redis"

inherit rpm
