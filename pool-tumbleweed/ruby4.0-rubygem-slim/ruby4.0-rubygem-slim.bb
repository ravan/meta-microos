SUMMARY = "Slim is a template language"
DESCRIPTION = "Slim is a template language whose goal is reduce the syntax to the essential \
parts without becoming cryptic."
LICENSE = "MIT"

PV = "5.2.1"

RPM_NAME = "ruby4.0-rubygem-slim-5.2.1-1.12.aarch64.rpm"
RPM_HASH = "9fee0690b5290f20eddd3be165bc85f21b3d3a4bcbc2bc3ef660165e5b915b55c3029643cafffefc3f42c3e9e0c46acf2ff39790aef71cd41238af949bcdb0b0"

RPROVIDES:${PN} += "ruby4.0-rubygem-slim \
rubygem-ruby-4.0.0-slim \
rubygem-ruby-4.0.0-slim-5 \
rubygem-ruby-4.0.0-slim-5.2 \
rubygem-ruby-4.0.0-slim-5.2.1 \
rubygem-slim"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby4.0 \
alts \
ruby-abi \
rubygem-ruby-4.0.0-temple-0.10 \
rubygem-ruby-4.0.0-tilt"

inherit rpm
