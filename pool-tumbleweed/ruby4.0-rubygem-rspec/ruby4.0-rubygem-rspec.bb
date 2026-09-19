SUMMARY = "Meta-gem that depends on the other components"
DESCRIPTION = "BDD for Ruby."
LICENSE = "MIT"

PV = "3.13.0"

RPM_NAME = "ruby4.0-rubygem-rspec-3.13.0-1.11.aarch64.rpm"
RPM_HASH = "30c418d431a213f97ed8074eee432ac8e8181fff8e67a8858a06b2c2bb3df46445ab4d41c58058d4c6ebf1034672361278232d171c7555a264d4dd69f629de7d"

RPROVIDES:${PN} += "ruby4.0-rubygem-rspec \
rubygem-rspec \
rubygem-ruby-4.0.0-rspec \
rubygem-ruby-4.0.0-rspec-3 \
rubygem-ruby-4.0.0-rspec-3.13 \
rubygem-ruby-4.0.0-rspec-3.13.0"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-rspec-core-3.13 \
rubygem-ruby-4.0.0-rspec-expectations-3.13 \
rubygem-ruby-4.0.0-rspec-mocks-3.13"

inherit rpm
