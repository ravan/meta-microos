SUMMARY = "The best way to manage your application's dependencies"
DESCRIPTION = "Bundler manages an application's dependencies through its entire life, across \
many machines, systematically and repeatably."
LICENSE = "MIT"

PV = "2.6.3"

RPM_NAME = "ruby4.0-rubygem-bundler-2.6.3-2.2.aarch64.rpm"
RPM_HASH = "a1df83b4909089cd01f2385614a1ce90199e6ad80d823704eae821a1810f9b14c0470401606aa9a717fb22f420220671d2b54d0a5471dfba3645b23e7bcd9ae6"

RPROVIDES:${PN} += "ruby4.0-rubygem-bundler \
rubygem-bundler \
rubygem-ruby-4.0.0-bundler \
rubygem-ruby-4.0.0-bundler-2 \
rubygem-ruby-4.0.0-bundler-2.6 \
rubygem-ruby-4.0.0-bundler-2.6.3"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby4.0 \
alts \
ruby-abi"

inherit rpm
