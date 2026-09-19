SUMMARY = "URI Implementation"
DESCRIPTION = "Addressable is an alternative implementation to the URI implementation that is \
part of Ruby's standard library. It is flexible, offers heuristic parsing, and \
additionally provides extensive support for IRIs and URI templates."
LICENSE = "Apache-2.0"

PV = "2.8.7"

RPM_NAME = "ruby4.0-rubygem-addressable-2.8.7-1.11.aarch64.rpm"
RPM_HASH = "4e1d81589a364327797f4ca2bea17f118159c02ce113a1f86221799afc9a1b811c2f4ce66807e8ae02262a314c532e7ba2905025ac0e5563ceaac013a8f7e7c1"

RPROVIDES:${PN} += "ruby4.0-rubygem-addressable \
rubygem-addressable \
rubygem-ruby-4.0.0-addressable \
rubygem-ruby-4.0.0-addressable-2 \
rubygem-ruby-4.0.0-addressable-2.8 \
rubygem-ruby-4.0.0-addressable-2.8.7"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-public-suffix"

inherit rpm
