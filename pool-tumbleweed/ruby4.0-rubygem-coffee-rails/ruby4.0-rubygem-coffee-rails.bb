SUMMARY = "CoffeeScript adapter for the Rails asset pipeline"
DESCRIPTION = "CoffeeScript adapter for the Rails asset pipeline."
LICENSE = "MIT"

PV = "5.0.0"

RPM_NAME = "ruby4.0-rubygem-coffee-rails-5.0.0-2.39.aarch64.rpm"
RPM_HASH = "9db84656b5033bea12c3c182b3d15aea6029da53e2b7790956400249973a9d8c68155a9483780d7da5416964ec4846a57c1ce6117b5a5c35c9e4911e85991af1"

RPROVIDES:${PN} += "ruby4.0-rubygem-coffee-rails \
rubygem-coffee-rails \
rubygem-ruby-4.0.0-coffee-rails \
rubygem-ruby-4.0.0-coffee-rails-5 \
rubygem-ruby-4.0.0-coffee-rails-5.0 \
rubygem-ruby-4.0.0-coffee-rails-5.0.0"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-coffee-script \
rubygem-ruby-4.0.0-railties"

inherit rpm
