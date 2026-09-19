SUMMARY = "Ruby extension for base32 encoding and decoding"
DESCRIPTION = "Ruby extension for base32 encoding and decoding."
LICENSE = "MIT"

PV = "0.3.4"

RPM_NAME = "ruby4.0-rubygem-base32-0.3.4-1.29.aarch64.rpm"
RPM_HASH = "0ec1882d8c751b1dedc0eafd8c1fe08826aecd36cda221bdd5e0d9d17bba3bc6d211230a67b12cf7d7a388b9414df455f12146bb9f86417fa696e61f9f413249"

RPROVIDES:${PN} += "ruby4.0-rubygem-base32 \
rubygem-base32 \
rubygem-ruby-4.0.0-base32 \
rubygem-ruby-4.0.0-base32-0 \
rubygem-ruby-4.0.0-base32-0.3 \
rubygem-ruby-4.0.0-base32-0.3.4"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
