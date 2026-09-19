SUMMARY = "Use jQuery with Rails 4+"
DESCRIPTION = "This gem provides jQuery and the jQuery-ujs driver for your Rails 4+ \
application."
LICENSE = "MIT"

PV = "4.6.0"

RPM_NAME = "ruby4.0-rubygem-jquery-rails-4.6.0-1.15.aarch64.rpm"
RPM_HASH = "a6bdb501881f333c7b4a6c0c40ac07fa091aac6c10d0b3351d50589acf364fa5cc673f713f5aeda6e90b971f797a4f8781400e4f3a36bf38f13c5046c36866c2"

RPROVIDES:${PN} += "ruby4.0-rubygem-jquery-rails \
rubygem-jquery-rails \
rubygem-ruby-4.0.0-jquery-rails \
rubygem-ruby-4.0.0-jquery-rails-4 \
rubygem-ruby-4.0.0-jquery-rails-4.6 \
rubygem-ruby-4.0.0-jquery-rails-4.6.0"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-rails-dom-testing \
rubygem-ruby-4.0.0-railties \
rubygem-ruby-4.0.0-thor"

inherit rpm
