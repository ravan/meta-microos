SUMMARY = "Simple WebSocket server and client for Python"
DESCRIPTION = "Simple WebSocket server and client for Python"
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python314-simple-websocket-1.1.0-1.3.noarch.rpm"
RPM_HASH = "0c5175976fd4383b555baf4cf10491acc3a409fc9c4476f81923c6eb35a9f73573a373ffda68bb95972341c351712e9cd57ec0bb8bc7aca2b9b0a463cebb4813"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-simple-websocket \
python314-simple-websocket \
python3dist-simple-websocket"

RDEPENDS:${PN} += "python-abi \
python314-wsproto"

inherit rpm
