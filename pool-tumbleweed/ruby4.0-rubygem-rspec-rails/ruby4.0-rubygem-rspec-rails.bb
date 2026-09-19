SUMMARY = "RSpec for Rails"
DESCRIPTION = "rspec-rails integrates the Rails testing helpers into RSpec."
LICENSE = "MIT"

PV = "7.0.1"

RPM_NAME = "ruby4.0-rubygem-rspec-rails-7.0.1-1.10.aarch64.rpm"
RPM_HASH = "641ba08e4131dcecfc40ae9204f1bdda96f6902756a25ce6fe87c8c2ea45cd2dbe1be4963ec1f1b2a9443cb1c5b73b1c59fa5cbdeba587cbebb78eb59013fe42"

RPROVIDES:${PN} += "ruby4.0-rubygem-rspec-rails \
rubygem-rspec-rails \
rubygem-ruby-4.0.0-rspec-rails \
rubygem-ruby-4.0.0-rspec-rails-7 \
rubygem-ruby-4.0.0-rspec-rails-7.0 \
rubygem-ruby-4.0.0-rspec-rails-7.0.1"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-actionpack \
rubygem-ruby-4.0.0-activesupport \
rubygem-ruby-4.0.0-railties \
rubygem-ruby-4.0.0-rspec-core-3 \
rubygem-ruby-4.0.0-rspec-expectations-3 \
rubygem-ruby-4.0.0-rspec-mocks-3 \
rubygem-ruby-4.0.0-rspec-support-3"

inherit rpm
