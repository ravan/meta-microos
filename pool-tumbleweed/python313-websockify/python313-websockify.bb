SUMMARY = "WebSocket to TCP proxy/bridge"
DESCRIPTION = "websockify was formerly named wsproxy and was part of the \
noVNC project. \
 \
At the most basic level, websockify just translates WebSockets traffic \
to normal socket traffic. Websockify accepts the WebSockets handshake, \
parses it, and then begins forwarding traffic between the client and \
the target in both directions."
LICENSE = "BSD-2-Clause & LGPL-3.0-only & MPL-2.0 & BSD-3-Clause"

PV = "0.13.0"

RPM_NAME = "python313-websockify-0.13.0-2.2.noarch.rpm"
RPM_HASH = "629cebb0bcd0f7da0fb590592015d7a26dc060e3611e2c47b72288b977fda8a320815d3bee794e508e7c7582f5a3363e0abdd9a28f56c61b5ef814ae2f054d3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-websockify \
python3.13dist-websockify \
python313-websockify \
python3dist-websockify"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-jwcrypto"

inherit rpm
