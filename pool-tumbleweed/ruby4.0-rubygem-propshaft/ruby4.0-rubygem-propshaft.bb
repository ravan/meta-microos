SUMMARY = "Deliver assets for Rails"
DESCRIPTION = "Deliver assets for Rails."
LICENSE = "MIT"

PV = "1.3.2"

RPM_NAME = "ruby4.0-rubygem-propshaft-1.3.2-1.2.aarch64.rpm"
RPM_HASH = "6e38691560b38478ef7efe966a016ccd4eeddb92cd071628659d1422eb24a253c03fb816088b5b4b82c54ac4c4d9799e642b38c830b052dc5879f745156092d6"

RPROVIDES:${PN} += "ruby4.0-rubygem-propshaft \
rubygem-propshaft \
rubygem-ruby-4.0.0-propshaft \
rubygem-ruby-4.0.0-propshaft-1 \
rubygem-ruby-4.0.0-propshaft-1.3 \
rubygem-ruby-4.0.0-propshaft-1.3.2"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-actionpack \
rubygem-ruby-4.0.0-activesupport \
rubygem-ruby-4.0.0-rack"

inherit rpm
