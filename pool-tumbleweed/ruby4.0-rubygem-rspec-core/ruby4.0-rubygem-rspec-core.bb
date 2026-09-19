SUMMARY = "RSpec runner and formatters"
DESCRIPTION = "BDD for Ruby. RSpec runner and example groups."
LICENSE = "MIT"

PV = "3.13.2"

RPM_NAME = "ruby4.0-rubygem-rspec-core-3.13.2-2.1.aarch64.rpm"
RPM_HASH = "07e6c12e3d92b7e146abafc8080b9931c4ad504c7713fb1ac431f8c7da7c388513b9ea1f67a07b87d71192dc8e8e4c42ba40a1de6e167feab0ad84401bb3137d"

RPROVIDES:${PN} += "ruby4.0-rubygem-rspec-core \
rubygem-rspec-core \
rubygem-ruby-4.0.0-rspec-core \
rubygem-ruby-4.0.0-rspec-core-3 \
rubygem-ruby-4.0.0-rspec-core-3.13 \
rubygem-ruby-4.0.0-rspec-core-3.13.2"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby4.0 \
alts \
ruby-abi \
rubygem-ruby-4.0.0-rspec-support-3.13"

inherit rpm
