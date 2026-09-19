SUMMARY = "A Websocket server written in Python"
DESCRIPTION = "A Websocket Server written in Python \
 \
- RFC 6455 \
- TLS/SSL out of the box \
- Passes Autobahn's websocket testsuite \
- Support for Python 2 and 3"
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python314-SimpleWebSocketServer-0.1.2-1.9.noarch.rpm"
RPM_HASH = "8204fd1af2e008f01d61c90d681f32417c2a106c84b838ede8a7022618601eb5460877c95c413bff63f2d021658333b177bde26da10353774b2ae04eb518f5b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-simplewebsocketserver \
python314-SimpleWebSocketServer \
python3dist-simplewebsocketserver"

RDEPENDS:${PN} += "python-abi"

inherit rpm
