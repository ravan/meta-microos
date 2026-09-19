SUMMARY = "Your friendly neighborhood hash library"
DESCRIPTION = "Hashie is a collection of classes and mixins that make hashes more powerful."
LICENSE = "MIT"

PV = "5.0.0"

RPM_NAME = "ruby4.0-rubygem-hashie-5.0.0-1.23.aarch64.rpm"
RPM_HASH = "42082f6b2e136c3d625a7d129f22a6bc3673355a857f6b7378f88ad7c052c7b7483fcfef4afbcfe4a44844253344dc7205b642e5109b83f7315a81b61c4c7602"

RPROVIDES:${PN} += "ruby4.0-rubygem-hashie \
rubygem-hashie \
rubygem-ruby-4.0.0-hashie \
rubygem-ruby-4.0.0-hashie-5 \
rubygem-ruby-4.0.0-hashie-5.0 \
rubygem-ruby-4.0.0-hashie-5.0.0"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
