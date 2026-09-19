SUMMARY = "RSpec's 'test double' framework, with support for stubbing and mocking"
DESCRIPTION = "RSpec's 'test double' framework, with support for stubbing and mocking."
LICENSE = "MIT"

PV = "3.13.2"

RPM_NAME = "ruby4.0-rubygem-rspec-mocks-3.13.2-1.10.aarch64.rpm"
RPM_HASH = "1b7c0602b44e96e11c4ba702ff223008a229ef63260cdafd9f41866e18dbde6146f134ec3e052bb86cfe592655a335dfde74580a46a34cd539c54866e0d35135"

RPROVIDES:${PN} += "ruby4.0-rubygem-rspec-mocks \
rubygem-rspec-mocks \
rubygem-ruby-4.0.0-rspec-mocks \
rubygem-ruby-4.0.0-rspec-mocks-3 \
rubygem-ruby-4.0.0-rspec-mocks-3.13 \
rubygem-ruby-4.0.0-rspec-mocks-3.13.2"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-diff-lcs \
rubygem-ruby-4.0.0-rspec-support-3.13"

inherit rpm
