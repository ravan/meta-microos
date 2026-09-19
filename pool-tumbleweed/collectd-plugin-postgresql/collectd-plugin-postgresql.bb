SUMMARY = "PostgreSQL Monitoring Plugin for collectd"
DESCRIPTION = "Optional collectd plugin to monitor PostgreSQL server instances."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.382.g2cd055fe"

RPM_NAME = "collectd-plugin-postgresql-5.12.0.382.g2cd055fe-3.1.aarch64.rpm"
RPM_HASH = "2bc98dc3ba18463cbfc79e8de0f1b1eac09c3dd0cd6244da1bd38e05013e24e42f703e4673eb96bc9c199e351e8fbd1847cf9571ca0a16d8766b80ab03a59019"

RPROVIDES:${PN} += "collectd-plugin-postgresql \
config-collectd-plugin-postgresql"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpq.so.5"

inherit rpm
