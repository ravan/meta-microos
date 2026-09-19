SUMMARY = "A modular Ruby webserver interface"
DESCRIPTION = "Rack provides a minimal, modular and adaptable interface for developing \
web applications in Ruby. By wrapping HTTP requests and responses in \
the simplest way possible, it unifies and distills the API for web \
servers, web frameworks, and software in between (the so-called \
middleware) into a single method call."
LICENSE = "MIT"

PV = "2.2.23"

RPM_NAME = "ruby4.0-rubygem-rack-2.2-2.2.23-1.3.aarch64.rpm"
RPM_HASH = "cd4a936cea399d828ba3b5f949b928dc74e9ac7abde46343e4fe50f7241e26f909cb660118daf1f248368497c88b065c4b4e3af9b2915e0994a9cc2142344479"

RPROVIDES:${PN} += "ruby4.0-rubygem-rack-2.2 \
rubygem-rack \
rubygem-ruby-4.0.0-rack \
rubygem-ruby-4.0.0-rack-2 \
rubygem-ruby-4.0.0-rack-2.2 \
rubygem-ruby-4.0.0-rack-2.2.23"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby4.0 \
alts \
ruby-abi"

inherit rpm
