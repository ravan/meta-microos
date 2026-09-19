SUMMARY = "A unified interface to key/value stores, including Redis, Memcached,"
DESCRIPTION = "A unified interface to key/value stores."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "ruby4.0-rubygem-moneta-1.6.0-1.15.aarch64.rpm"
RPM_HASH = "8d5dbcbe7bc9a399a11b2ec5696f9f43ba505127f3f0ef771cfb962ebb6c37aa11514ef139e55c2621f0f256aaf91d315c5bdb429be2b3d3288698b0fd4d9523"

RPROVIDES:${PN} += "ruby4.0-rubygem-moneta \
rubygem-moneta \
rubygem-ruby-4.0.0-moneta \
rubygem-ruby-4.0.0-moneta-1 \
rubygem-ruby-4.0.0-moneta-1.6 \
rubygem-ruby-4.0.0-moneta-1.6.0"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
