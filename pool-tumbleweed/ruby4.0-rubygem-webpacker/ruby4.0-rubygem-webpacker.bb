SUMMARY = "Use webpack to manage app-like JavaScript modules in Rails"
DESCRIPTION = "Use webpack to manage app-like JavaScript modules in Rails."
LICENSE = "MIT"

PV = "5.4.4"

RPM_NAME = "ruby4.0-rubygem-webpacker-5.4.4-1.15.aarch64.rpm"
RPM_HASH = "c0ba4372fae8a3a0d8563e09d68be8234d99556194fbfb02903c9a6e63f727b235a343f1a5c2e67ada32c4aba4cec62b22cb98fd19d649173f1d542105216d2a"

RPROVIDES:${PN} += "ruby4.0-rubygem-webpacker \
rubygem-ruby-4.0.0-webpacker \
rubygem-ruby-4.0.0-webpacker-5 \
rubygem-ruby-4.0.0-webpacker-5.4 \
rubygem-ruby-4.0.0-webpacker-5.4.4 \
rubygem-webpacker"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby4.0 \
ruby-abi \
rubygem-ruby-4.0.0-activesupport \
rubygem-ruby-4.0.0-rack-proxy \
rubygem-ruby-4.0.0-railties \
rubygem-ruby-4.0.0-semantic-range"

inherit rpm
