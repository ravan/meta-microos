SUMMARY = "A simple, configurable object container implemented in Ruby"
DESCRIPTION = "A simple, configurable object container implemented in Ruby."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "ruby4.0-rubygem-dry-container-0.11.0-1.19.aarch64.rpm"
RPM_HASH = "2be81e503bd843405efa12ea737cf6afd86b0869b02fb0b27eca73170c433ad811d4ba715ca0150f73449ef88cfb00ca3ba3dfaad724301b9e1707cd5a7e5d3e"

RPROVIDES:${PN} += "ruby4.0-rubygem-dry-container \
rubygem-dry-container \
rubygem-ruby-4.0.0-dry-container \
rubygem-ruby-4.0.0-dry-container-0 \
rubygem-ruby-4.0.0-dry-container-0.11 \
rubygem-ruby-4.0.0-dry-container-0.11.0"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-concurrent-ruby-1"

inherit rpm
