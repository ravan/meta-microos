SUMMARY = "Ruby gem to treat Ruby objects as a domain-specific language"
DESCRIPTION = "Docile treats the methods of a given ruby object as a DSL (domain specific \
language) within a given block. \
Killer feature: you can also reference methods, instance variables, and local \
variables from the original (non-DSL) context within the block. \
Docile releases follow Semantic Versioning as defined at semver.org."
LICENSE = "MIT"

PV = "1.4.1"

RPM_NAME = "ruby4.0-rubygem-docile-1.4.1-1.10.aarch64.rpm"
RPM_HASH = "359382507389103ab571097c4bd25f1e7369e398a53232ee7a82e0a3004eee9a63b6b2997026bf65c83bf1b70d796106bb44d42b3528f90672fc5015ad386370"

RPROVIDES:${PN} += "ruby4.0-rubygem-docile \
rubygem-docile \
rubygem-ruby-4.0.0-docile \
rubygem-ruby-4.0.0-docile-1 \
rubygem-ruby-4.0.0-docile-1.4 \
rubygem-ruby-4.0.0-docile-1.4.1"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
