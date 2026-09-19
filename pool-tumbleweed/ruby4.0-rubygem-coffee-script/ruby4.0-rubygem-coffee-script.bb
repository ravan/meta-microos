SUMMARY = "Ruby CoffeeScript Compiler"
DESCRIPTION = "Ruby CoffeeScript is a bridge to the JS CoffeeScript compiler."
LICENSE = "MIT"

PV = "2.4.1"

RPM_NAME = "ruby4.0-rubygem-coffee-script-2.4.1-1.51.aarch64.rpm"
RPM_HASH = "c7876dfee3b051cf8864936d187fe88500a9e532fd48142f3585c908bbca1b32964965b96cb9560b707bda48bed09684d508be2ca28c7db7a9ba6b6e0e03be05"

RPROVIDES:${PN} += "ruby4.0-rubygem-coffee-script \
rubygem-coffee-script \
rubygem-ruby-4.0.0-coffee-script \
rubygem-ruby-4.0.0-coffee-script-2 \
rubygem-ruby-4.0.0-coffee-script-2.4 \
rubygem-ruby-4.0.0-coffee-script-2.4.1"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-coffee-script-source \
rubygem-ruby-4.0.0-execjs"

inherit rpm
