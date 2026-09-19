SUMMARY = "Generic extension manager for WebSocket connections"
DESCRIPTION = "Generic extension manager for WebSocket connections."
LICENSE = "Apache-2.0"

PV = "0.1.5"

RPM_NAME = "ruby4.0-rubygem-websocket-extensions-0.1.5-1.30.aarch64.rpm"
RPM_HASH = "30972676e5b6ffde980b952b443d3b0a6cf8867ebfd609fcebc986e1955b8aa622a0442ac832fbc6dce00a92350b8f6d6611e756346eaaf0c0a1013c8fd77673"

RPROVIDES:${PN} += "ruby4.0-rubygem-websocket-extensions \
rubygem-ruby-4.0.0-websocket-extensions \
rubygem-ruby-4.0.0-websocket-extensions-0 \
rubygem-ruby-4.0.0-websocket-extensions-0.1 \
rubygem-ruby-4.0.0-websocket-extensions-0.1.5 \
rubygem-websocket-extensions"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
