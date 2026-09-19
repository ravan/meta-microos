SUMMARY = "The CoffeeScript Compiler"
DESCRIPTION = "CoffeeScript is a little language that compiles into JavaScript. \
Underneath all of those embarrassing braces and semicolons, \
JavaScript has always had a gorgeous object model at its heart. \
CoffeeScript is an attempt to expose the good parts of JavaScript \
in a simple way."
LICENSE = "MIT"

PV = "1.12.2"

RPM_NAME = "ruby4.0-rubygem-coffee-script-source-1.12.2-1.42.aarch64.rpm"
RPM_HASH = "c8cc1a9ad7c507e145e8cd8e79298d6488a02f07649990e6d8c33b8a0cb36a6074f3e536fe965596c292463429f6cd06d6ba0ff75080536aa9e764c6e4fe1fb0"

RPROVIDES:${PN} += "ruby4.0-rubygem-coffee-script-source \
rubygem-coffee-script-source \
rubygem-ruby-4.0.0-coffee-script-source \
rubygem-ruby-4.0.0-coffee-script-source-1 \
rubygem-ruby-4.0.0-coffee-script-source-1.12 \
rubygem-ruby-4.0.0-coffee-script-source-1.12.2"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
