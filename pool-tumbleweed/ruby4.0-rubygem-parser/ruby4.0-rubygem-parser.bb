SUMMARY = "A Ruby parser written in pure Ruby"
DESCRIPTION = "A Ruby parser written in pure Ruby."
LICENSE = "MIT"

PV = "3.3.7.4"

RPM_NAME = "ruby4.0-rubygem-parser-3.3.7.4-2.4.aarch64.rpm"
RPM_HASH = "bf50cdcf389a3af46460d5c5bf2900d3dc8e3fc82bbdfc8cf1fedca128211624eaa1de611c7a66b0aee5e77f4da5d834af52a7b42b08045b360d998729a1f7d0"

RPROVIDES:${PN} += "ruby4.0-rubygem-parser \
rubygem-parser \
rubygem-ruby-4.0.0-parser \
rubygem-ruby-4.0.0-parser-3 \
rubygem-ruby-4.0.0-parser-3.3 \
rubygem-ruby-4.0.0-parser-3.3.7"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby4.0 \
alts \
ruby-abi \
rubygem-ruby-4.0.0-ast-2.4 \
rubygem-ruby-4.0.0-racc"

inherit rpm
