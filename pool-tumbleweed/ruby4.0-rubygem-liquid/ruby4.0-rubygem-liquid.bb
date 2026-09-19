SUMMARY = "A secure, non-evaling end user template engine with aesthetic markup"
DESCRIPTION = "A secure, non-evaling end user template engine with aesthetic markup."
LICENSE = "MIT"

PV = "5.5.1"

RPM_NAME = "ruby4.0-rubygem-liquid-5.5.1-1.10.aarch64.rpm"
RPM_HASH = "722e31c42bfb7f4be09e9d558851432cb8609e3acd014e1eff0e8b755a91a51d991ef27c0c9678659ab04a7abe6160a0b25d8be0c090fc71c2d3f349f9c5bfb7"

RPROVIDES:${PN} += "ruby4.0-rubygem-liquid \
rubygem-liquid \
rubygem-ruby-4.0.0-liquid \
rubygem-ruby-4.0.0-liquid-5 \
rubygem-ruby-4.0.0-liquid-5.5 \
rubygem-ruby-4.0.0-liquid-5.5.1"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
