SUMMARY = "Higher-level data structures built on Redis"
DESCRIPTION = "Higher-level data structures built on Redis."
LICENSE = "MIT"

PV = "1.8.0"

RPM_NAME = "ruby4.0-rubygem-kredis-1.8.0-1.2.aarch64.rpm"
RPM_HASH = "866bf18c28020e3948f9becb71ecb21a065c3c617b2c2f22cdf9f4716a175d086701a3e8aee741a502aadc3654a658e6a5dfd41c7e5d872d805a20629b7fc01a"

RPROVIDES:${PN} += "ruby4.0-rubygem-kredis \
rubygem-kredis \
rubygem-ruby-4.0.0-kredis \
rubygem-ruby-4.0.0-kredis-1 \
rubygem-ruby-4.0.0-kredis-1.8 \
rubygem-ruby-4.0.0-kredis-1.8.0"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-activemodel \
rubygem-ruby-4.0.0-activesupport \
rubygem-ruby-4.0.0-redis"

inherit rpm
