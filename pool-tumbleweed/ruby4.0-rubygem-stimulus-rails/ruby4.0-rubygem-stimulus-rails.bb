SUMMARY = "A modest JavaScript framework for the HTML you already have"
DESCRIPTION = "A modest JavaScript framework for the HTML you already have."
LICENSE = "MIT"

PV = "1.3.4"

RPM_NAME = "ruby4.0-rubygem-stimulus-rails-1.3.4-1.10.aarch64.rpm"
RPM_HASH = "9b107b740e0dea8bc205a0e09e893fa7025e387f5f994d55722ea04d9da3dfaf4aa1becd055a0dc5b2e2d30ca9e70d2dedc72552710d423cadc342205c40457c"

RPROVIDES:${PN} += "ruby4.0-rubygem-stimulus-rails \
rubygem-ruby-4.0.0-stimulus-rails \
rubygem-ruby-4.0.0-stimulus-rails-1 \
rubygem-ruby-4.0.0-stimulus-rails-1.3 \
rubygem-ruby-4.0.0-stimulus-rails-1.3.4 \
rubygem-stimulus-rails"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-railties"

inherit rpm
