SUMMARY = "WebSocket library for Trio"
DESCRIPTION = "WebSocket library for Trio"
LICENSE = "MIT"

PV = "0.12.2"

RPM_NAME = "python313-trio-websocket-0.12.2-1.2.noarch.rpm"
RPM_HASH = "401215b3301701b828c07c4db2ab7364cffb54de36a1d65017b08856d4cbcb73c6f24bf5f6c17b61cf5c94a10b166eaf65ac0a26ffa39cf3ab14c45904ced1cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-trio-websocket \
python3.13dist-trio-websocket \
python313-trio-websocket \
python3dist-trio-websocket"

RDEPENDS:${PN} += "python-abi \
python313-trio \
python313-wsproto"

inherit rpm
