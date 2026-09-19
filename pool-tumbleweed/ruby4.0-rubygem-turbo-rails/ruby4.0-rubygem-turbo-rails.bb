SUMMARY = "The speed of a single-page web application without having to write"
DESCRIPTION = "The speed of a single-page web application without having to write any \
JavaScript."
LICENSE = "MIT"

PV = "2.0.20"

RPM_NAME = "ruby4.0-rubygem-turbo-rails-2.0.20-1.5.aarch64.rpm"
RPM_HASH = "8c7316657894d3bbecb3fd904edd3bff367f60a043f5ad512f0994e58339c0b546048cf1bd72247b1fbedd3fcbfa7932c8bb70e6ad446debc0aa5af514c091d0"

RPROVIDES:${PN} += "ruby4.0-rubygem-turbo-rails \
rubygem-ruby-4.0.0-turbo-rails \
rubygem-ruby-4.0.0-turbo-rails-2 \
rubygem-ruby-4.0.0-turbo-rails-2.0 \
rubygem-ruby-4.0.0-turbo-rails-2.0.20 \
rubygem-turbo-rails"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-actionpack \
rubygem-ruby-4.0.0-railties"

inherit rpm
