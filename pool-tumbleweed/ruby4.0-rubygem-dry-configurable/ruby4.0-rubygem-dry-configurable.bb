SUMMARY = "A mixin to add configuration functionality to your classes"
DESCRIPTION = "A mixin to add configuration functionality to your classes."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "ruby4.0-rubygem-dry-configurable-1.0.1-1.17.aarch64.rpm"
RPM_HASH = "544dde4094a2d68cd1a6d55fa9773ae756a59fd107c7aebbb637d1f98248b8b7ca4c935401b06f24c0db599f445c31e7ab5c9638d56bd2410a436e71c29c1c3d"

RPROVIDES:${PN} += "ruby4.0-rubygem-dry-configurable \
rubygem-dry-configurable \
rubygem-ruby-4.0.0-dry-configurable \
rubygem-ruby-4.0.0-dry-configurable-1 \
rubygem-ruby-4.0.0-dry-configurable-1.0 \
rubygem-ruby-4.0.0-dry-configurable-1.0.1"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-dry-core \
rubygem-ruby-4.0.0-dry-core-1 \
rubygem-ruby-4.0.0-zeitwerk-2"

inherit rpm
