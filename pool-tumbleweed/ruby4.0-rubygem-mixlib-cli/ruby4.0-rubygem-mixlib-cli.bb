SUMMARY = "A simple mixin for CLI interfaces, including option parsing"
DESCRIPTION = "A simple mixin for CLI interfaces, including option parsing."
LICENSE = "Apache-2.0"

PV = "2.1.8"

RPM_NAME = "ruby4.0-rubygem-mixlib-cli-2.1.8-1.28.aarch64.rpm"
RPM_HASH = "5b83b44a076398557b94077f323b45c9f59adaae03ec8a71014b69639289d4e261ea95b5988592724b7109a239e1694880df27ae722d4dffb522e485f3c7ebfb"

RPROVIDES:${PN} += "ruby4.0-rubygem-mixlib-cli \
rubygem-mixlib-cli \
rubygem-ruby-4.0.0-mixlib-cli \
rubygem-ruby-4.0.0-mixlib-cli-2 \
rubygem-ruby-4.0.0-mixlib-cli-2.1 \
rubygem-ruby-4.0.0-mixlib-cli-2.1.8"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
