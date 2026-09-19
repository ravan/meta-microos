SUMMARY = "A modular Ruby webserver interface"
DESCRIPTION = "Rack provides a minimal, modular and adaptable interface for developing \
web applications in Ruby. By wrapping HTTP requests and responses in \
the simplest way possible, it unifies and distills the API for web \
servers, web frameworks, and software in between (the so-called \
middleware) into a single method call."
LICENSE = "MIT"

PV = "3.2.7"

RPM_NAME = "ruby4.0-rubygem-rack-3.2.7-1.1.aarch64.rpm"
RPM_HASH = "20b6521186bb60345cfe8cfe64cc3f509412f90c9b7a0954329a6f5fdf2819bb2c75dc34bab70cd11253e73927146b7e368edb5a28006c131df0aa9370d946fd"

RPROVIDES:${PN} += "ruby4.0-rubygem-rack \
rubygem-rack \
rubygem-ruby-4.0.0-rack \
rubygem-ruby-4.0.0-rack-3 \
rubygem-ruby-4.0.0-rack-3.2 \
rubygem-ruby-4.0.0-rack-3.2.7"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
