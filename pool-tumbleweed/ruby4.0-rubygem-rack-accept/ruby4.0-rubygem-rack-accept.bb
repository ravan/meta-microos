SUMMARY = "HTTP Accept* for Ruby/Rack"
DESCRIPTION = "HTTP Accept, Accept-Charset, Accept-Encoding, and Accept-Language for \
Ruby/Rack."
LICENSE = "MIT"

PV = "0.4.5"

RPM_NAME = "ruby4.0-rubygem-rack-accept-0.4.5-1.34.aarch64.rpm"
RPM_HASH = "2a3ab17d2ca973813f250291f76675537a756bd3b9b7a116ea41d2d06b7e35ade0650e3a4bf188b125909f04170eaef614fb02650061fb659eaa2823e53e109e"

RPROVIDES:${PN} += "ruby4.0-rubygem-rack-accept \
rubygem-rack-accept \
rubygem-ruby-4.0.0-rack-accept \
rubygem-ruby-4.0.0-rack-accept-0 \
rubygem-ruby-4.0.0-rack-accept-0.4 \
rubygem-ruby-4.0.0-rack-accept-0.4.5"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-rack"

inherit rpm
