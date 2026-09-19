SUMMARY = "Universal Ruby library to handle WebSocket protocol"
DESCRIPTION = "Universal Ruby library to handle WebSocket protocol."
LICENSE = "MIT"

PV = "1.2.11"

RPM_NAME = "ruby4.0-rubygem-websocket-1.2.11-1.11.aarch64.rpm"
RPM_HASH = "5f4c7297f3f7ad6193a402f781ddced62ebf55bf6cb15e97a14db1052ea7955841fed36976c5fd208e9ae7d4ae0d9df4b6a9577f2ec1f64e585240b12a5b491b"

RPROVIDES:${PN} += "ruby4.0-rubygem-websocket \
rubygem-ruby-4.0.0-websocket \
rubygem-ruby-4.0.0-websocket-1 \
rubygem-ruby-4.0.0-websocket-1.2 \
rubygem-ruby-4.0.0-websocket-1.2.11 \
rubygem-websocket"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
