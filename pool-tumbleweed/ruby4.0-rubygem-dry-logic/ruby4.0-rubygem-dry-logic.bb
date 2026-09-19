SUMMARY = "Predicate logic with rule composition"
DESCRIPTION = "Predicate logic with rule composition."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "ruby4.0-rubygem-dry-logic-1.5.0-1.17.aarch64.rpm"
RPM_HASH = "3c4fb0c2cde75b4d63414d75e973d6b31c8b0d741e1650e098bd098e1e61b034f96c93ddcc8095ddc3114fa1d5b0be936610bd158f31a948cc6d6aa9af58aa16"

RPROVIDES:${PN} += "ruby4.0-rubygem-dry-logic \
rubygem-dry-logic \
rubygem-ruby-4.0.0-dry-logic \
rubygem-ruby-4.0.0-dry-logic-1 \
rubygem-ruby-4.0.0-dry-logic-1.5 \
rubygem-ruby-4.0.0-dry-logic-1.5.0"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-concurrent-ruby-1 \
rubygem-ruby-4.0.0-dry-core \
rubygem-ruby-4.0.0-dry-core-1 \
rubygem-ruby-4.0.0-zeitwerk-2"

inherit rpm
