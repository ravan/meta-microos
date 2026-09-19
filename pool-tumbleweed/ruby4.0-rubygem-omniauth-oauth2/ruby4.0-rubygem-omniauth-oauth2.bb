SUMMARY = "An abstract OAuth2 strategy for OmniAuth"
DESCRIPTION = "An abstract OAuth2 strategy for OmniAuth."
LICENSE = "MIT"

PV = "1.8.0"

RPM_NAME = "ruby4.0-rubygem-omniauth-oauth2-1.8.0-1.19.aarch64.rpm"
RPM_HASH = "4a5647a5b2f0f198d584455ca8c96dad18024d0823f43833123a95e04e2a856318dfb3972f142f6a3df333f5df428632d970b6d515532feec355dd65e0b1779e"

RPROVIDES:${PN} += "ruby4.0-rubygem-omniauth-oauth2 \
rubygem-omniauth-oauth2 \
rubygem-ruby-4.0.0-omniauth-oauth2 \
rubygem-ruby-4.0.0-omniauth-oauth2-1 \
rubygem-ruby-4.0.0-omniauth-oauth2-1.8 \
rubygem-ruby-4.0.0-omniauth-oauth2-1.8.0"

RDEPENDS:${PN} += "/usr/bin/env \
ruby-abi \
rubygem-ruby-4.0.0-oauth2 \
rubygem-ruby-4.0.0-omniauth-2"

inherit rpm
