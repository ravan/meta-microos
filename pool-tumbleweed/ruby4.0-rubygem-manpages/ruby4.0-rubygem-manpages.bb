SUMMARY = "Adds support for man pages to rubygems"
DESCRIPTION = "With this gem the rubygems command will detect man pages within gems and \
exposes them to the man command."
LICENSE = "MIT"

PV = "0.6.1"

RPM_NAME = "ruby4.0-rubygem-manpages-0.6.1-1.31.aarch64.rpm"
RPM_HASH = "643dab095215e7edc624d71700f4419f4a0573193a83eefd3218bdb5eecaae18050af36f3564fa8b73caaceff5ee63b9f7684402e3797b197a0f7d4769463454"

RPROVIDES:${PN} += "ruby4.0-rubygem-manpages \
rubygem-manpages \
rubygem-ruby-4.0.0-manpages \
rubygem-ruby-4.0.0-manpages-0 \
rubygem-ruby-4.0.0-manpages-0.6 \
rubygem-ruby-4.0.0-manpages-0.6.1"

RDEPENDS:${PN} += "/usr/bin/bash \
ruby-abi"

inherit rpm
