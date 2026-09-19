SUMMARY = "node-semver rewritten in ruby, for comparison and inclusion of"
DESCRIPTION = "node-semver rewritten in ruby, for comparison and inclusion of semantic \
versions and ranges."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "ruby4.0-rubygem-semantic_range-3.1.0-1.10.aarch64.rpm"
RPM_HASH = "56c59b38598f4af85fa53146d64b545cc67757beeb138f7ea9ffc615c7f9c911e6443faac4fbb5d031ec799d8b5cdcc4c859630e2e740018ac916e8fec3e49f6"

RPROVIDES:${PN} += "ruby4.0-rubygem-semantic-range \
rubygem-ruby-4.0.0-semantic-range \
rubygem-ruby-4.0.0-semantic-range-3 \
rubygem-ruby-4.0.0-semantic-range-3.1 \
rubygem-ruby-4.0.0-semantic-range-3.1.0 \
rubygem-semantic-range"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
