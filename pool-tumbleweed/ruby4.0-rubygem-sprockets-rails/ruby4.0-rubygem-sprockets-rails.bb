SUMMARY = "Sprockets Rails integration"
DESCRIPTION = "Sprockets Rails integration."
LICENSE = "MIT"

PV = "3.5.2"

RPM_NAME = "ruby4.0-rubygem-sprockets-rails-3.5.2-1.10.aarch64.rpm"
RPM_HASH = "372e584c6a85283cc590b56daec1eeaeda5d3ef8a36b061c110363332242ca998f6dad82255987650dca95cd7ace17ac5c93451394944f6f1cc4318f47b82519"

RPROVIDES:${PN} += "ruby4.0-rubygem-sprockets-rails \
rubygem-ruby-4.0.0-sprockets-rails \
rubygem-ruby-4.0.0-sprockets-rails-3 \
rubygem-ruby-4.0.0-sprockets-rails-3.5 \
rubygem-ruby-4.0.0-sprockets-rails-3.5.2 \
rubygem-sprockets-rails"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-actionpack \
rubygem-ruby-4.0.0-activesupport \
rubygem-ruby-4.0.0-sprockets"

inherit rpm
