SUMMARY = "WebSocket library for Trio"
DESCRIPTION = "WebSocket library for Trio"
LICENSE = "MIT"

PV = "0.12.2"

RPM_NAME = "python314-trio-websocket-0.12.2-1.2.noarch.rpm"
RPM_HASH = "b8ee78d2ed2b75a5e338bcbd8b0ac86ed4332fd03a0738c60c5a6c413908b9eaf0cfd5c8a233edaab6b8cba5815387ba66be32eb343aac5657ea4cdde3f20ae8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-trio-websocket \
python314-trio-websocket \
python3dist-trio-websocket"

RDEPENDS:${PN} += "python-abi \
python314-trio \
python314-wsproto"

inherit rpm
