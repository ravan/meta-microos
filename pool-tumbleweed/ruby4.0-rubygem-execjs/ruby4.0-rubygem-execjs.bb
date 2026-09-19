SUMMARY = "Run JavaScript code from Ruby"
DESCRIPTION = "ExecJS lets you run JavaScript code from Ruby."
LICENSE = "MIT"

PV = "2.10.0"

RPM_NAME = "ruby4.0-rubygem-execjs-2.10.0-1.11.aarch64.rpm"
RPM_HASH = "6e9fa7fba8b6598eca0d7ea0f1d3c06941545d79a4addb07dd049e4ee7b93dc358a943267c8b181d37604555148991cbcd35bae45e48c44e184af05de58bf5a7"

RPROVIDES:${PN} += "ruby4.0-rubygem-execjs \
rubygem-execjs \
rubygem-ruby-4.0.0-execjs \
rubygem-ruby-4.0.0-execjs-2 \
rubygem-ruby-4.0.0-execjs-2.10 \
rubygem-ruby-4.0.0-execjs-2.10.0"

RDEPENDS:${PN} += "nodejs \
ruby-abi"

inherit rpm
