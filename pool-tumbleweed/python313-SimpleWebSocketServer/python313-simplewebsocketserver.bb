SUMMARY = "A Websocket server written in Python"
DESCRIPTION = "A Websocket Server written in Python \
 \
- RFC 6455 \
- TLS/SSL out of the box \
- Passes Autobahn's websocket testsuite \
- Support for Python 2 and 3"
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python313-SimpleWebSocketServer-0.1.2-1.9.noarch.rpm"
RPM_HASH = "54cec9350429249e2ebd1ec29939f175bcdd4475fbb224ae16284f0cfe800da80a7c12f2ad001ef023bfbb710a398f098b0a11fa087d8d083b3bc060ec192bda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-SimpleWebSocketServer \
python3.13dist-simplewebsocketserver \
python313-SimpleWebSocketServer \
python3dist-simplewebsocketserver"

RDEPENDS:${PN} += "python-abi"

inherit rpm
