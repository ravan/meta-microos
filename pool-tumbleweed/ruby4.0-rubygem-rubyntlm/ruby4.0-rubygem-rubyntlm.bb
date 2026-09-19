SUMMARY = "Ruby/NTLM library"
DESCRIPTION = "Ruby/NTLM provides message creator and parser for the NTLM authentication."
LICENSE = "MIT"

PV = "0.6.5"

RPM_NAME = "ruby4.0-rubygem-rubyntlm-0.6.5-1.11.aarch64.rpm"
RPM_HASH = "2cab7778a358498d206f8721b6d3c2b95244813a17f40ef7820cea04af45ea559b13e593709cde28510a7048626927d716797c957660fe2c54147507357d4e2c"

RPROVIDES:${PN} += "ruby4.0-rubygem-rubyntlm \
rubygem-ruby-4.0.0-rubyntlm \
rubygem-ruby-4.0.0-rubyntlm-0 \
rubygem-ruby-4.0.0-rubyntlm-0.6 \
rubygem-ruby-4.0.0-rubyntlm-0.6.5 \
rubygem-rubyntlm"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-base64"

inherit rpm
