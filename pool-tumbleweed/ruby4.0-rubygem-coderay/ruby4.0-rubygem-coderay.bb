SUMMARY = "Fast syntax highlighting for selected languages"
DESCRIPTION = "Fast and easy syntax highlighting for selected languages, written in Ruby. \
Comes with RedCloth integration and LOC counter."
LICENSE = "MIT"

PV = "1.1.3"

RPM_NAME = "ruby4.0-rubygem-coderay-1.1.3-1.32.aarch64.rpm"
RPM_HASH = "2840abd476b8543928ac13e4c03959f691e216339b4289cdb090ed4245d7fe3e9ebb4f0780241a3176b2928645a591b651970b07542e0dfa534b8984a4df9d82"

RPROVIDES:${PN} += "ruby4.0-rubygem-coderay \
rubygem-coderay \
rubygem-ruby-4.0.0-coderay \
rubygem-ruby-4.0.0-coderay-1 \
rubygem-ruby-4.0.0-coderay-1.1 \
rubygem-ruby-4.0.0-coderay-1.1.3"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby4.0 \
alts \
ruby-abi"

inherit rpm
