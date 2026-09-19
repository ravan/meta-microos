SUMMARY = "String inflections for dry-rb"
DESCRIPTION = "String inflections for dry-rb."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "ruby4.0-rubygem-dry-inflector-1.1.0-1.11.aarch64.rpm"
RPM_HASH = "d1aa485cde8f9ef3fdabbff4019b9e917bc6ba8e9357dad669ec940c4fff900588f84d371d06dd6d0559bcceead08fd60138a26e2f6053749194c2bc75fb66eb"

RPROVIDES:${PN} += "ruby4.0-rubygem-dry-inflector \
rubygem-dry-inflector \
rubygem-ruby-4.0.0-dry-inflector \
rubygem-ruby-4.0.0-dry-inflector-1 \
rubygem-ruby-4.0.0-dry-inflector-1.1 \
rubygem-ruby-4.0.0-dry-inflector-1.1.0"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
