SUMMARY = "Use ESM with importmap to manage modern JavaScript in Rails without"
DESCRIPTION = "Use ESM with importmap to manage modern JavaScript in Rails without \
transpiling or bundling."
LICENSE = "MIT"

PV = "2.0.3"

RPM_NAME = "ruby4.0-rubygem-importmap-rails-2.0.3-1.10.aarch64.rpm"
RPM_HASH = "012c25f271cc8fa767582d739ea77c9ba627a780d8e54684e261fd027ef8121cd66af247600cc54589f7964288ccd9a052c89f2f3a3f2beed1be947412d36fe4"

RPROVIDES:${PN} += "ruby4.0-rubygem-importmap-rails \
rubygem-importmap-rails \
rubygem-ruby-4.0.0-importmap-rails \
rubygem-ruby-4.0.0-importmap-rails-2 \
rubygem-ruby-4.0.0-importmap-rails-2.0 \
rubygem-ruby-4.0.0-importmap-rails-2.0.3"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby4.0 \
ruby-abi \
rubygem-ruby-4.0.0-actionpack \
rubygem-ruby-4.0.0-activesupport \
rubygem-ruby-4.0.0-railties"

inherit rpm
