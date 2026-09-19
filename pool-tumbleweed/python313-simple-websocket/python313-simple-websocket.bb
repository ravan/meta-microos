SUMMARY = "Simple WebSocket server and client for Python"
DESCRIPTION = "Simple WebSocket server and client for Python"
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python313-simple-websocket-1.1.0-1.3.noarch.rpm"
RPM_HASH = "58aff5eb0dd53a6d3663e39a3e73370b6151ad33029ebded080a41c1d508ef27614ed4ec2dae627fd5dbe083369b3a76282746020d24fbd97cca5757bf9351d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-simple-websocket \
python3.13dist-simple-websocket \
python313-simple-websocket \
python3dist-simple-websocket"

RDEPENDS:${PN} += "python-abi \
python313-wsproto"

inherit rpm
