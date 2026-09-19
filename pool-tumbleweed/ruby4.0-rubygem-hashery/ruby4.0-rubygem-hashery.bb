SUMMARY = "Facets-bread collection of Hash-like classes"
DESCRIPTION = "The Hashery is a tight collection of Hash-like classes. Included among its \
many offerings are the auto-sorting Dictionary class, the efficient LRUHash, \
the flexible OpenHash and the convenient KeyHash. Nearly every class is a \
subclass of the CRUDHash which defines a CRUD model on top of Ruby's standard \
Hash making it a snap to subclass and augment to fit any specific use case."
LICENSE = "BSD-2-Clause"

PV = "2.1.2"

RPM_NAME = "ruby4.0-rubygem-hashery-2.1.2-2.28.aarch64.rpm"
RPM_HASH = "5f15cb4ef005a18f32b9c366acfff26250463e005888923b609506f8ff1e8f58289f8add2c1a7cba4353a6a2a20b8772e3e41d799da4f679a9b62194b5f24ad3"

RPROVIDES:${PN} += "ruby4.0-rubygem-hashery \
rubygem-hashery \
rubygem-ruby-4.0.0-hashery \
rubygem-ruby-4.0.0-hashery-2 \
rubygem-ruby-4.0.0-hashery-2.1 \
rubygem-ruby-4.0.0-hashery-2.1.2"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
