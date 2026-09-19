SUMMARY = "A request/response rewriting HTTP proxy. A Rack app"
DESCRIPTION = "A Rack app that provides request/response rewriting proxy capabilities with \
streaming."
LICENSE = "MIT"

PV = "0.7.7"

RPM_NAME = "ruby4.0-rubygem-rack-proxy-0.7.7-1.15.aarch64.rpm"
RPM_HASH = "b2dd524efb3a6362076cc78b62245f0f8d10b7cd1ba3e2622ea87a3272e719e75788e28427e55dbf17405914b312f06d5290df459573efbc41f0b3d505cfa875"

RPROVIDES:${PN} += "ruby4.0-rubygem-rack-proxy \
rubygem-rack-proxy \
rubygem-ruby-4.0.0-rack-proxy \
rubygem-ruby-4.0.0-rack-proxy-0 \
rubygem-ruby-4.0.0-rack-proxy-0.7 \
rubygem-ruby-4.0.0-rack-proxy-0.7.7"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-rack"

inherit rpm
