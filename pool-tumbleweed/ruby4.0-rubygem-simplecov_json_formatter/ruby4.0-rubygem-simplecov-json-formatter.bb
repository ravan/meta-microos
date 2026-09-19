SUMMARY = "JSON formatter for SimpleCov"
DESCRIPTION = "JSON formatter for SimpleCov."
LICENSE = "MIT"

PV = "0.1.4"

RPM_NAME = "ruby4.0-rubygem-simplecov_json_formatter-0.1.4-1.23.aarch64.rpm"
RPM_HASH = "49acc91bea1f5a7cf9f110e5c33c037082b9aba37b17ba2bb22277b0e181eb1a56a1a10978482da25ebe35af58b665a15b34a1352efae305a18147f7c03e3aed"

RPROVIDES:${PN} += "ruby4.0-rubygem-simplecov-json-formatter \
rubygem-ruby-4.0.0-simplecov-json-formatter \
rubygem-ruby-4.0.0-simplecov-json-formatter-0 \
rubygem-ruby-4.0.0-simplecov-json-formatter-0.1 \
rubygem-ruby-4.0.0-simplecov-json-formatter-0.1.4 \
rubygem-simplecov-json-formatter"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
