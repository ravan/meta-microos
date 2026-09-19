SUMMARY = "Rack-based asset packaging system"
DESCRIPTION = "Sprockets is a Rack-based asset packaging system that concatenates and serves \
JavaScript, CoffeeScript, CSS, Sass, and SCSS."
LICENSE = "MIT"

PV = "4.2.1"

RPM_NAME = "ruby4.0-rubygem-sprockets-4.2.1-1.16.aarch64.rpm"
RPM_HASH = "fa1b2f8cd3fc8278655e0389753b07c53fa44dfc82286cd0737398dd3ce541ed7c213083a709685d94fe81d58154e6e515da1503a7558278b98646a7ff2cbbe6"

RPROVIDES:${PN} += "ruby4.0-rubygem-sprockets \
rubygem-ruby-4.0.0-sprockets \
rubygem-ruby-4.0.0-sprockets-4 \
rubygem-ruby-4.0.0-sprockets-4.2 \
rubygem-ruby-4.0.0-sprockets-4.2.1 \
rubygem-sprockets"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby4.0 \
alts \
ruby-abi \
rubygem-ruby-4.0.0-concurrent-ruby-1 \
rubygem-ruby-4.0.0-rack"

inherit rpm
