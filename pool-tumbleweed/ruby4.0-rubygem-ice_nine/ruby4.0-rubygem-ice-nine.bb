SUMMARY = "Deep Freeze Ruby Objects"
DESCRIPTION = "Deep Freeze Ruby Objects."
LICENSE = "MIT"

PV = "0.11.2"

RPM_NAME = "ruby4.0-rubygem-ice_nine-0.11.2-1.44.aarch64.rpm"
RPM_HASH = "a84e0ece1249ce7840867cf0cc39279e565b5041906fbf00289900d471837066d9cdb9345578f6d594b7d4f6a46c9606e15ea7aebb5f71e30fa37d1535f6912d"

RPROVIDES:${PN} += "ruby4.0-rubygem-ice-nine \
rubygem-ice-nine \
rubygem-ruby-4.0.0-ice-nine \
rubygem-ruby-4.0.0-ice-nine-0 \
rubygem-ruby-4.0.0-ice-nine-0.11 \
rubygem-ruby-4.0.0-ice-nine-0.11.2"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby4.0 \
ruby-abi"

inherit rpm
