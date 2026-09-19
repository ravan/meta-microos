SUMMARY = "Run Test::Unit / RSpec / Cucumber / Spinach in parallel"
DESCRIPTION = "Run Test::Unit / RSpec / Cucumber / Spinach in parallel."
LICENSE = "MIT"

PV = "4.7.1"

RPM_NAME = "ruby4.0-rubygem-parallel_tests-4.7.1-2.1.aarch64.rpm"
RPM_HASH = "10bfc192d2d7167555c0ea7b7f1999055e981f8b47caaee9364d79c5eecc1de433a761cc73d601a8bd2db7c954cea50b9f8f776d039d4d8aa52e827eb88d454c"

RPROVIDES:${PN} += "ruby4.0-rubygem-parallel-tests \
rubygem-parallel-tests \
rubygem-ruby-4.0.0-parallel-tests \
rubygem-ruby-4.0.0-parallel-tests-4 \
rubygem-ruby-4.0.0-parallel-tests-4.7 \
rubygem-ruby-4.0.0-parallel-tests-4.7.1"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby4.0 \
alts \
ruby-abi \
rubygem-ruby-4.0.0-parallel"

inherit rpm
