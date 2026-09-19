SUMMARY = "Asset path helpers for Sprockets 2.x & 3.x applications"
DESCRIPTION = "Asset path helpers for Sprockets 2.x & 3.x applications."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "ruby4.0-rubygem-sprockets-helpers-1.4.0-1.29.aarch64.rpm"
RPM_HASH = "eeee0d033a44c3b685368863a1a2fb6924651d4c5fce7ecfd28c5c040196d9a8608c65a696ebd35855173ac4cc6f178132742220cb32f5de3dcf2fa4653b81f6"

RPROVIDES:${PN} += "ruby4.0-rubygem-sprockets-helpers \
rubygem-ruby-4.0.0-sprockets-helpers \
rubygem-ruby-4.0.0-sprockets-helpers-1 \
rubygem-ruby-4.0.0-sprockets-helpers-1.4 \
rubygem-ruby-4.0.0-sprockets-helpers-1.4.0 \
rubygem-sprockets-helpers"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-sprockets"

inherit rpm
