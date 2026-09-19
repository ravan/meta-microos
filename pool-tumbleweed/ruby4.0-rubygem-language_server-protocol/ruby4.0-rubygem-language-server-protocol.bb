SUMMARY = "A Language Server Protocol SDK"
DESCRIPTION = "A Language Server Protocol SDK."
LICENSE = "MIT"

PV = "3.17.0.4"

RPM_NAME = "ruby4.0-rubygem-language_server-protocol-3.17.0.4-1.7.aarch64.rpm"
RPM_HASH = "140d28d9eec3ecd5c2953e3507cc11072811cd3c06d4853317459bcabb6f8eb1acea8ef3c84a87a52103dfe43f76729d107fb1dbd17e81a65a96b2a9e3f5ea10"

RPROVIDES:${PN} += "ruby4.0-rubygem-language-server-protocol \
rubygem-language-server-protocol \
rubygem-ruby-4.0.0-language-server-protocol \
rubygem-ruby-4.0.0-language-server-protocol-3 \
rubygem-ruby-4.0.0-language-server-protocol-3.17 \
rubygem-ruby-4.0.0-language-server-protocol-3.17.0"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
