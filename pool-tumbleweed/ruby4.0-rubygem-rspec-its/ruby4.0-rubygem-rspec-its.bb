SUMMARY = "Provides 'its' method formerly part of rspec-core"
DESCRIPTION = "RSpec extension gem for attribute matching."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "ruby4.0-rubygem-rspec-its-1.3.0-1.31.aarch64.rpm"
RPM_HASH = "60cdddf92a295fac75181b895067ebcdd1d801ef26f159f179ea0ff33fa80f3ac302e3f2cf2a5a4a6e692ca4ae65f4581d87f7c9a59c56765617794dba44d946"

RPROVIDES:${PN} += "ruby4.0-rubygem-rspec-its \
rubygem-rspec-its \
rubygem-ruby-4.0.0-rspec-its \
rubygem-ruby-4.0.0-rspec-its-1 \
rubygem-ruby-4.0.0-rspec-its-1.3 \
rubygem-ruby-4.0.0-rspec-its-1.3.0"

RDEPENDS:${PN} += "/usr/bin/bash \
ruby-abi \
rubygem-ruby-4.0.0-rspec-core \
rubygem-ruby-4.0.0-rspec-expectations"

inherit rpm
