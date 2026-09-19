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

RPM_NAME = "python314-websockify-0.13.0-2.2.noarch.rpm"
RPM_HASH = "5127a4444c98c03e38d1c6702335306b1620db69c15f903f32195d8559b78774a4c4cd0e5ad639c0196e78a2288b9cbaf32bcc1f05a59c89b462686d838cd435"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-websockify \
python314-websockify \
python3dist-websockify"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-jwcrypto"

inherit rpm
