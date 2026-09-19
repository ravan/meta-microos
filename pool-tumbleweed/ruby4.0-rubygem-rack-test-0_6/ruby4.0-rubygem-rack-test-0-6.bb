SUMMARY = "Simple testing API built on Rack"
DESCRIPTION = "Rack::Test is a small, simple testing API for Rack apps. It can be used on its \
own or as a reusable starting point for Web frameworks and testing libraries \
to build on. Most of its initial functionality is an extraction of Merb 1.0's \
request helpers feature."
LICENSE = "MIT"

PV = "0.6.3"

RPM_NAME = "ruby4.0-rubygem-rack-test-0_6-0.6.3-1.46.aarch64.rpm"
RPM_HASH = "3899412d6d37a780b248fb19a1c67e8d2e6b68c6f82457f0f1ad6825cd3567454d83e70215df094e0b1a333dcc4c190712754609d07e1eeb728dfa40a0927197"

RPROVIDES:${PN} += "ruby4.0-rubygem-rack-test-0-6 \
rubygem-rack-test \
rubygem-ruby-4.0.0-rack-test \
rubygem-ruby-4.0.0-rack-test-0 \
rubygem-ruby-4.0.0-rack-test-0.6 \
rubygem-ruby-4.0.0-rack-test-0.6.3"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-rack"

inherit rpm
