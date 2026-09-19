SUMMARY = "A Ruby wrapper for the OAuth 2.0 protocol"
DESCRIPTION = "A Ruby wrapper for the OAuth 2.0 protocol built with a similar style to the \
original OAuth spec."
LICENSE = "MIT"

PV = "2.0.9"

RPM_NAME = "ruby4.0-rubygem-oauth2-2.0.9-1.19.aarch64.rpm"
RPM_HASH = "8059f38cf9f00c0ae68a0df36228932246345abf07b48c3d57416f1f23cca6a95cb7917e0e2cf6dac9854ab1ade0644c691395ca3d4c3d69668eb56a550f8a7d"

RPROVIDES:${PN} += "ruby4.0-rubygem-oauth2 \
rubygem-oauth2 \
rubygem-ruby-4.0.0-oauth2 \
rubygem-ruby-4.0.0-oauth2-2 \
rubygem-ruby-4.0.0-oauth2-2.0 \
rubygem-ruby-4.0.0-oauth2-2.0.9"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-faraday \
rubygem-ruby-4.0.0-jwt \
rubygem-ruby-4.0.0-multi-xml-0 \
rubygem-ruby-4.0.0-rack \
rubygem-ruby-4.0.0-snaky-hash-2 \
rubygem-ruby-4.0.0-version-gem-1"

inherit rpm
