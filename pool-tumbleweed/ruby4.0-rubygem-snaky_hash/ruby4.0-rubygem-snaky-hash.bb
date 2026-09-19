SUMMARY = "A very snaky hash"
DESCRIPTION = "A Hashie::Mash joint to make #snakelife better."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "ruby4.0-rubygem-snaky_hash-2.0.1-1.19.aarch64.rpm"
RPM_HASH = "181b61363cd781eb3947aa77f21c82d214e58455cb7d5bc3d179deca47a34b67107d58ab4ff85c5a7e57c896a19599bc7f8c1f2b7f7ee4d15a12690f509b68a7"

RPROVIDES:${PN} += "ruby4.0-rubygem-snaky-hash \
rubygem-ruby-4.0.0-snaky-hash \
rubygem-ruby-4.0.0-snaky-hash-2 \
rubygem-ruby-4.0.0-snaky-hash-2.0 \
rubygem-ruby-4.0.0-snaky-hash-2.0.1 \
rubygem-snaky-hash"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-hashie \
rubygem-ruby-4.0.0-version-gem \
rubygem-ruby-4.0.0-version-gem-1"

inherit rpm
