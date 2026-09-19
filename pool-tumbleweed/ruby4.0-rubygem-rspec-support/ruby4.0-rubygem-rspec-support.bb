SUMMARY = "Common code needed by the other RSpec gems"
DESCRIPTION = "Support utilities for RSpec gems."
LICENSE = "MIT"

PV = "3.13.1"

RPM_NAME = "ruby4.0-rubygem-rspec-support-3.13.1-1.11.aarch64.rpm"
RPM_HASH = "499fb41ea8b87e9e1bbdb4a50414bf37f5a8bbcba4dc07c649250cbe51a6db2be2ac0b10791949e0f62d228eb08a92a25f41506ac9fc3f1480688f91ba6e1cea"

RPROVIDES:${PN} += "ruby4.0-rubygem-rspec-support \
rubygem-rspec-support \
rubygem-ruby-4.0.0-rspec-support \
rubygem-ruby-4.0.0-rspec-support-3 \
rubygem-ruby-4.0.0-rspec-support-3.13 \
rubygem-ruby-4.0.0-rspec-support-3.13.1"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
