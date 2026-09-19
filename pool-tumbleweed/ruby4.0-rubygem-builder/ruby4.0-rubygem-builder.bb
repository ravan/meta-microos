SUMMARY = "Builders for MarkUp"
DESCRIPTION = "Builder provides a number of builder objects that make creating structured \
data \
simple to do.  Currently the following builder objects are supported: \
* XML Markup \
* XML Events."
LICENSE = "MIT"

PV = "3.3.0"

RPM_NAME = "ruby4.0-rubygem-builder-3.3.0-1.11.aarch64.rpm"
RPM_HASH = "d10ef22bd3403410dbfc576213a645a398a83fe65c6f171da7776677ee62229a869677fbc75dc7afd3a026624aaca18e10cd0e5e5d76cf6db5316e1a4b01719c"

RPROVIDES:${PN} += "ruby4.0-rubygem-builder \
rubygem-builder \
rubygem-ruby-4.0.0-builder \
rubygem-ruby-4.0.0-builder-3 \
rubygem-ruby-4.0.0-builder-3.3 \
rubygem-ruby-4.0.0-builder-3.3.0"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby4.0 \
ruby-abi"

inherit rpm
