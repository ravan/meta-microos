SUMMARY = "A session implementation for Rack"
DESCRIPTION = "A session implementation for Rack."
LICENSE = "MIT"

PV = "2.1.2"

RPM_NAME = "ruby4.0-rubygem-rack-session-2.1.2-1.3.aarch64.rpm"
RPM_HASH = "06f91cba7f7843351654149109aeb8c0a3c9951213c4a04a97fff7c070f8ea3c421d380b3d9f430e91e99431c25a254822be792c1fe21c03975f10b7e3197fc7"

RPROVIDES:${PN} += "ruby4.0-rubygem-rack-session \
rubygem-rack-session \
rubygem-ruby-4.0.0-rack-session \
rubygem-ruby-4.0.0-rack-session-2 \
rubygem-ruby-4.0.0-rack-session-2.1 \
rubygem-ruby-4.0.0-rack-session-2.1.2"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-base64 \
rubygem-ruby-4.0.0-rack"

inherit rpm
