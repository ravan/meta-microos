SUMMARY = "Tools for creating, working with, and running Rails applications"
DESCRIPTION = "Rails internals: application bootup, plugins, generators, and rake tasks."
LICENSE = "MIT"

PV = "8.0.5"

RPM_NAME = "ruby4.0-rubygem-railties-8.0-8.0.5-1.2.aarch64.rpm"
RPM_HASH = "72800d5d6b9fb98c8d2c274cb5a196dd1a18acb8e844e1d9af640e946bb7eb780ce197f2c419860c304f6415672bc432bc6753fabd2bf98158f78e642cc296bc"

RPROVIDES:${PN} += "ruby4.0-rubygem-railties-8.0 \
rubygem-railties \
rubygem-ruby-4.0.0-railties \
rubygem-ruby-4.0.0-railties-8 \
rubygem-ruby-4.0.0-railties-8.0 \
rubygem-ruby-4.0.0-railties-8.0.5"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/ruby.ruby4.0 \
alts \
ruby-abi \
rubygem-ruby-4.0.0-actionpack \
rubygem-ruby-4.0.0-activesupport \
rubygem-ruby-4.0.0-irb-1 \
rubygem-ruby-4.0.0-rackup \
rubygem-ruby-4.0.0-rake \
rubygem-ruby-4.0.0-thor \
rubygem-ruby-4.0.0-thor-1 \
rubygem-ruby-4.0.0-tsort \
rubygem-ruby-4.0.0-zeitwerk-2"

inherit rpm
