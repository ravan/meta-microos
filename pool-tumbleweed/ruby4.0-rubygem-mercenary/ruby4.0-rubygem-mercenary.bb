SUMMARY = "Lightweight and flexible library for writing command-line apps in"
DESCRIPTION = "Lightweight and flexible library for writing command-line apps in Ruby."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "ruby4.0-rubygem-mercenary-0.4.0-1.31.aarch64.rpm"
RPM_HASH = "e75682a35ba26d526691775fccc356c3a07b7b903962a5d3c31c6e34b69d53172434c9da6aca1ffda35c764484756886e00ecaf8a6460b0d0e0b8e699fd16ade"

RPROVIDES:${PN} += "ruby4.0-rubygem-mercenary \
rubygem-mercenary \
rubygem-ruby-4.0.0-mercenary \
rubygem-ruby-4.0.0-mercenary-0 \
rubygem-ruby-4.0.0-mercenary-0.4 \
rubygem-ruby-4.0.0-mercenary-0.4.0"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/ruby.ruby4.0 \
/usr/bin/sh \
ruby-abi"

inherit rpm
