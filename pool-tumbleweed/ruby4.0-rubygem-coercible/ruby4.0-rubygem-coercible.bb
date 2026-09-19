SUMMARY = "Powerful, flexible and configurable coercion library"
DESCRIPTION = "Powerful, flexible and configurable coercion library. And nothing more."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "ruby4.0-rubygem-coercible-1.0.0-1.45.aarch64.rpm"
RPM_HASH = "4e3f5777be5f28c5f08c28cd4c69a35ecc43833fff5f37b55afe1d584c0ca628153ef200bf7199fa79f53246591d443e0c27b0db73e88ef67cd88495edd546b4"

RPROVIDES:${PN} += "ruby4.0-rubygem-coercible \
rubygem-coercible \
rubygem-ruby-4.0.0-coercible \
rubygem-ruby-4.0.0-coercible-1 \
rubygem-ruby-4.0.0-coercible-1.0 \
rubygem-ruby-4.0.0-coercible-1.0.0"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-descendants-tracker-0.0"

inherit rpm
