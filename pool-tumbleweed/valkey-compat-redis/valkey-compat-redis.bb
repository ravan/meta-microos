SUMMARY = "Conversion script and compatibility symlinks for Redis"
DESCRIPTION = "This package contains compatibility symlinks and wrappers to enable \
easy conversion from Redis to Valkey."
LICENSE = "BSD-3-Clause"

PV = "9.1.2"

RPM_NAME = "valkey-compat-redis-9.1.2-1.1.noarch.rpm"
RPM_HASH = "8c293d16cf1479941627d46b56f5ae77c2d335e4254122d6d77a559a533e9c969704849488166cf29001c76821288b535e4d35d9ade90889cde3f6d287f5e89e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "redis \
valkey-compat-redis"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/find \
/usr/bin/sh \
valkey"

inherit rpm
