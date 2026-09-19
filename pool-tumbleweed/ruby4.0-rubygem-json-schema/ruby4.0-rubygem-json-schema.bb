SUMMARY = "Ruby JSON Schema Validator"
DESCRIPTION = "Ruby JSON Schema Validator."
LICENSE = "MIT"

PV = "5.0.1"

RPM_NAME = "ruby4.0-rubygem-json-schema-5.0.1-1.10.aarch64.rpm"
RPM_HASH = "5af367a2d21d929ebc99bd76217401d6e24461ad505ad5e2ecc01e803bc5cecfa170d5083723618d987a9b18f21e0c3c6ce3fd0c1426d4883968a57e677c87ad"

RPROVIDES:${PN} += "ruby4.0-rubygem-json-schema \
rubygem-json-schema \
rubygem-ruby-4.0.0-json-schema \
rubygem-ruby-4.0.0-json-schema-5 \
rubygem-ruby-4.0.0-json-schema-5.0 \
rubygem-ruby-4.0.0-json-schema-5.0.1"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby4.0 \
ruby-abi \
rubygem-ruby-4.0.0-addressable-2"

inherit rpm
