SUMMARY = "Simple low-level client for Redis 6+"
DESCRIPTION = "Simple low-level client for Redis 6+."
LICENSE = "MIT"

PV = "0.30.0"

RPM_NAME = "ruby4.0-rubygem-redis-client-0.30.0-1.2.aarch64.rpm"
RPM_HASH = "1b7dd0ff2a9cc1952c7bea99273bb28471bffb312710c83699d8a6c59ae5eb143e55ff5ea4ff255d72cd4522d9ef966d88a5031ef93e98f8a9ac51a9a06dd848"

RPROVIDES:${PN} += "ruby4.0-rubygem-redis-client \
rubygem-redis-client \
rubygem-ruby-4.0.0-redis-client \
rubygem-ruby-4.0.0-redis-client-0 \
rubygem-ruby-4.0.0-redis-client-0.30 \
rubygem-ruby-4.0.0-redis-client-0.30.0"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-connection-pool"

inherit rpm
