SUMMARY = "A debugging tool for your Ruby on Rails applications"
DESCRIPTION = "A debugging tool for your Ruby on Rails applications."
LICENSE = "MIT"

PV = "4.2.1"

RPM_NAME = "ruby4.0-rubygem-web-console-4.2.1-1.15.aarch64.rpm"
RPM_HASH = "f5ed211322cd7f393457eb2b828d30adc155ce3c559e72324e4f137e674d9e6fd683a825f217b7e9b26b5f0d94429e07eef3e4c36b32b45316be89ec3d82ae16"

RPROVIDES:${PN} += "ruby4.0-rubygem-web-console \
rubygem-ruby-4.0.0-web-console \
rubygem-ruby-4.0.0-web-console-4 \
rubygem-ruby-4.0.0-web-console-4.2 \
rubygem-ruby-4.0.0-web-console-4.2.1 \
rubygem-web-console"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-actionview \
rubygem-ruby-4.0.0-activemodel \
rubygem-ruby-4.0.0-bindex \
rubygem-ruby-4.0.0-railties"

inherit rpm
