SUMMARY = "Rails application preloader"
DESCRIPTION = "Preloads your application so things like console, rake and tests run faster."
LICENSE = "MIT"

PV = "4.2.1"

RPM_NAME = "ruby4.0-rubygem-spring-4.2.1-1.12.aarch64.rpm"
RPM_HASH = "6c6a2f42be5967dd690c9e81510f3f5f667e3c4307eb06854a15352de53c8a50a1742656698cdb0acd3ca271cbc29c23fb5e9a019c528227b751d79d1755b5fe"

RPROVIDES:${PN} += "ruby4.0-rubygem-spring \
rubygem-ruby-4.0.0-spring \
rubygem-ruby-4.0.0-spring-4 \
rubygem-ruby-4.0.0-spring-4.2 \
rubygem-ruby-4.0.0-spring-4.2.1 \
rubygem-spring"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby4.0 \
alts \
ruby-abi"

inherit rpm
