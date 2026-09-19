SUMMARY = "A library for consuming and serving OpenID identities"
DESCRIPTION = "A library for consuming and serving OpenID identities."
LICENSE = "Ruby & Apache-2.0"

PV = "2.9.2"

RPM_NAME = "ruby4.0-rubygem-ruby-openid-2.9.2-1.31.aarch64.rpm"
RPM_HASH = "f6517960db1589468013dbbddc001e79110c249afde55da06f91d65e0b9243a1640d077b311978c5c311a07bf0e6467e263a3a4c6360bbbda29c06a628ea5b2c"

RPROVIDES:${PN} += "ruby4.0-rubygem-ruby-openid \
rubygem-ruby-4.0.0-ruby-openid \
rubygem-ruby-4.0.0-ruby-openid-2 \
rubygem-ruby-4.0.0-ruby-openid-2.9 \
rubygem-ruby-4.0.0-ruby-openid-2.9.2 \
rubygem-ruby-openid"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby4.0 \
ruby-abi"

inherit rpm
