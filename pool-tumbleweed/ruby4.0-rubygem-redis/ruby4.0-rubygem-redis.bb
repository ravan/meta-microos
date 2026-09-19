SUMMARY = "A Ruby client library for Redis"
DESCRIPTION = "A Ruby client that tries to match Redis' API one-to-one, while still \
providing an idiomatic interface."
LICENSE = "MIT"

PV = "5.4.1"

RPM_NAME = "ruby4.0-rubygem-redis-5.4.1-1.2.aarch64.rpm"
RPM_HASH = "91d05aaa3a8300c78b0ca9ae7d5c93d030e346df7e10d37a7284e7be6164d4baec4f29b77a645bac5a32fabf12bfc1d05880b1f2bd16ebdd59b57c4d5185e7c8"

RPROVIDES:${PN} += "ruby4.0-rubygem-redis \
rubygem-redis \
rubygem-ruby-4.0.0-redis \
rubygem-ruby-4.0.0-redis-5 \
rubygem-ruby-4.0.0-redis-5.4 \
rubygem-ruby-4.0.0-redis-5.4.1"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-redis-client"

inherit rpm
