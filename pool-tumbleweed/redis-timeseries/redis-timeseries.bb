SUMMARY = "Time series data type for Redis"
DESCRIPTION = "RedisTimeSeries adds a time series data type to Redis, with downsampling, \
compaction rules, aggregation and secondary indexing by label. \
 \
Load it by adding the following to a configuration file below \
/etc/redis/includes: \
 \
    loadmodule /usr/lib64/redis/modules/redistimeseries.so"
LICENSE = "AGPL-3.0-only"

PV = "8.10.1"

RPM_NAME = "redis-timeseries-8.10.1-1.1.aarch64.rpm"
RPM_HASH = "78314c27f7ff6aca5ee691ed8d72b6da6860282d675e2fde88d9adc2599490dcc3575531a97b029c547153dcfd11f9380b91abfb869d66e8a49afd57b3a36c96"

RPROVIDES:${PN} += "redis-timeseries \
redistimeseries"

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
