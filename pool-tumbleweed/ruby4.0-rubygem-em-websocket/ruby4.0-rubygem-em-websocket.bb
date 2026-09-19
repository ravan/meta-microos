SUMMARY = "EventMachine based WebSocket server"
DESCRIPTION = "EventMachine based WebSocket server."
LICENSE = "MIT"

PV = "0.5.3"

RPM_NAME = "ruby4.0-rubygem-em-websocket-0.5.3-1.23.aarch64.rpm"
RPM_HASH = "89fe0c0a7cc685f315d6c5ff1fd1b0f5abc4d814ad178196ded90cf7d245b0f6a06adf79511b4eb19428ed191f1ced1fbdb639321d95e2bf19987603653103e4"

RPROVIDES:${PN} += "ruby4.0-rubygem-em-websocket \
rubygem-em-websocket \
rubygem-ruby-4.0.0-em-websocket \
rubygem-ruby-4.0.0-em-websocket-0 \
rubygem-ruby-4.0.0-em-websocket-0.5 \
rubygem-ruby-4.0.0-em-websocket-0.5.3"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-eventmachine \
rubygem-ruby-4.0.0-http-parser.rb"

inherit rpm
