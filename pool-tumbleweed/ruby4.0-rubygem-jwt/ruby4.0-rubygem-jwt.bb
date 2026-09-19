SUMMARY = "JSON Web Token implementation in Ruby"
DESCRIPTION = "A pure ruby implementation of the RFC 7519 OAuth JSON Web Token (JWT) \
standard."
LICENSE = "MIT"

PV = "2.9.3"

RPM_NAME = "ruby4.0-rubygem-jwt-2.9.3-1.10.aarch64.rpm"
RPM_HASH = "26824d54a3a8c4d47493d561422affdd8195d2d0c2ab98509e69f809c58357bbe2d1d0f4e7b000c4f16e42c44f26b92f7dbfb1d6d76bbc02a00ab4b5d147c34a"

RPROVIDES:${PN} += "ruby4.0-rubygem-jwt \
rubygem-jwt \
rubygem-ruby-4.0.0-jwt \
rubygem-ruby-4.0.0-jwt-2 \
rubygem-ruby-4.0.0-jwt-2.9 \
rubygem-ruby-4.0.0-jwt-2.9.3"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-base64"

inherit rpm
