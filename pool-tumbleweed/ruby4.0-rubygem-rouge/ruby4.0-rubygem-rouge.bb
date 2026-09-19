SUMMARY = "A pure-ruby colorizer based on pygments"
DESCRIPTION = "Rouge aims to a be a simple, easy-to-extend drop-in replacement for pygments."
LICENSE = "BSD-2-Clause | MIT"

PV = "4.5.1"

RPM_NAME = "ruby4.0-rubygem-rouge-4.5.1-1.7.aarch64.rpm"
RPM_HASH = "bd1ad16fb11936a0fc63455107daa48135e6e49ab6c047f9b78205dd21b2654d3593bf5ff5203fb6a41586eff816ecf417991f3d1c301e4e0d79caba57c75955"

RPROVIDES:${PN} += "ruby4.0-rubygem-rouge \
rubygem-rouge \
rubygem-ruby-4.0.0-rouge \
rubygem-ruby-4.0.0-rouge-4 \
rubygem-ruby-4.0.0-rouge-4.5 \
rubygem-ruby-4.0.0-rouge-4.5.1"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby4.0 \
alts \
ruby-abi"

inherit rpm
