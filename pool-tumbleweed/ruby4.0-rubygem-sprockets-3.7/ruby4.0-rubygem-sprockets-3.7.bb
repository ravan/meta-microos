SUMMARY = "Rack-based asset packaging system"
DESCRIPTION = "Sprockets is a Rack-based asset packaging system that concatenates and serves \
JavaScript, CoffeeScript, CSS, LESS, Sass, and SCSS."
LICENSE = "MIT"

PV = "3.7.5"

RPM_NAME = "ruby4.0-rubygem-sprockets-3.7-3.7.5-1.11.aarch64.rpm"
RPM_HASH = "a3551d26c381fcdaff45419bdab4cfb411fc2342852400024bd9981a184c5188637029c9dfb25c089ce0e55de4f90801bfc2b3a2cb06d4cf90fc16e39cbc2d15"

RPROVIDES:${PN} += "ruby4.0-rubygem-sprockets-3.7 \
rubygem-ruby-4.0.0-sprockets \
rubygem-ruby-4.0.0-sprockets-3 \
rubygem-ruby-4.0.0-sprockets-3.7 \
rubygem-ruby-4.0.0-sprockets-3.7.5 \
rubygem-sprockets"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby4.0 \
alts \
ruby-abi \
rubygem-ruby-4.0.0-base64 \
rubygem-ruby-4.0.0-concurrent-ruby-1 \
rubygem-ruby-4.0.0-rack"

inherit rpm
