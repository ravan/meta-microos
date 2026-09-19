SUMMARY = "Documentation tool for consistent and usable documentation in Ruby"
DESCRIPTION = "YARD is a documentation generation tool for the Ruby programming language. \
It enables the user to generate consistent, usable documentation that can be \
exported to a number of formats very easily, and also supports extending for \
custom Ruby constructs such as custom class level definitions."
LICENSE = "MIT"

PV = "0.9.37"

RPM_NAME = "ruby4.0-rubygem-yard-0.9.37-1.11.aarch64.rpm"
RPM_HASH = "a9f5838283c0943108e1b2b93ce60a81fb1b808a9ef2741578e812c281eeb2c5248557405fbca4f5ad6339274d005f1fcb6f06c452f4defb0a149a6e2bb37a97"

RPROVIDES:${PN} += "ruby4.0-rubygem-yard \
rubygem-ruby-4.0.0-yard \
rubygem-ruby-4.0.0-yard-0 \
rubygem-ruby-4.0.0-yard-0.9 \
rubygem-ruby-4.0.0-yard-0.9.37 \
rubygem-yard"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby4.0 \
alts \
ruby-abi"

inherit rpm
