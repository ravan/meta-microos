SUMMARY = "WebSocket framework for Rails"
DESCRIPTION = "Structure many real-time application concerns into channels over a single \
WebSocket connection."
LICENSE = "MIT"

PV = "8.0.5"

RPM_NAME = "ruby4.0-rubygem-actioncable-8.0-8.0.5-1.2.aarch64.rpm"
RPM_HASH = "105c18e9a9c9f1ec72e951324de83ddb5008efaadbeb9f7fe5afb0b47b546d8c081ab89268be1b7dc1ea0120b1d1711ab05c20485f5eec7121cfbf5f76cb3f78"

RPROVIDES:${PN} += "ruby4.0-rubygem-actioncable-8.0 \
rubygem-actioncable \
rubygem-ruby-4.0.0-actioncable \
rubygem-ruby-4.0.0-actioncable-8 \
rubygem-ruby-4.0.0-actioncable-8.0 \
rubygem-ruby-4.0.0-actioncable-8.0.5"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-actionpack \
rubygem-ruby-4.0.0-activesupport \
rubygem-ruby-4.0.0-nio4r-2 \
rubygem-ruby-4.0.0-websocket-driver \
rubygem-ruby-4.0.0-zeitwerk-2"

inherit rpm
