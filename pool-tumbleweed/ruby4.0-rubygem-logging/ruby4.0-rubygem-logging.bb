SUMMARY = "A flexible and extendable logging library for Ruby"
DESCRIPTION = "**Logging** is a flexible logging library for use in Ruby programs based on \
the \
design of Java's log4j library. It features a hierarchical logging system, \
custom level names, multiple output destinations per log event, custom \
formatting, and more."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "ruby4.0-rubygem-logging-2.4.0-1.11.aarch64.rpm"
RPM_HASH = "90c1ac00e0988c87725028464d98ea1749fcc3bf3a42539dd84de5e2cd504285066e37bc28407c128f30bbdb826d5ee560dee07b9d44b89edb1b34cb49fc585d"

RPROVIDES:${PN} += "ruby4.0-rubygem-logging \
rubygem-logging \
rubygem-ruby-4.0.0-logging \
rubygem-ruby-4.0.0-logging-2 \
rubygem-ruby-4.0.0-logging-2.4 \
rubygem-ruby-4.0.0-logging-2.4.0"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/ruby.ruby4.0 \
ruby-abi \
rubygem-ruby-4.0.0-little-plugger-1 \
rubygem-ruby-4.0.0-multi-json-1"

inherit rpm
