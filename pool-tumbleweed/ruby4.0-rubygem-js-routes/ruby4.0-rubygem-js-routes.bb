SUMMARY = "Brings Rails named routes to javascript"
DESCRIPTION = "Exposes all Rails Routes URL helpers as javascript module."
LICENSE = "MIT"

PV = "2.2.10"

RPM_NAME = "ruby4.0-rubygem-js-routes-2.2.10-1.10.aarch64.rpm"
RPM_HASH = "c8288f1d3e7e1f97e6790143407d1072a3f1911cacc2559c9f8bab83a0d37a96dccc949995e59a42bfe321dd665c0ce7a68317c0afb350b27406fcd8c2621037"

RPROVIDES:${PN} += "ruby4.0-rubygem-js-routes \
rubygem-js-routes \
rubygem-ruby-4.0.0-js-routes \
rubygem-ruby-4.0.0-js-routes-2 \
rubygem-ruby-4.0.0-js-routes-2.2 \
rubygem-ruby-4.0.0-js-routes-2.2.10"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-railties \
rubygem-ruby-4.0.0-sorbet-runtime"

inherit rpm
