SUMMARY = "WebSocket client implementation"
DESCRIPTION = "The websocket-client module is a WebSocket client for Python. This provides the \
low-level APIs for WebSocket. All APIs are synchronous functions. \
 \
Websocket-client supports only hybi-13."
LICENSE = "Apache-2.0"

PV = "1.9.0"

RPM_NAME = "python314-websocket-client-1.9.0-2.4.noarch.rpm"
RPM_HASH = "57f118fe4b9fc504af3b8b0b15624054b2be4be095af191987ef7be0f945255eb13fe1e3856299e1adf9caff536e504242d78de61854cc61981f82d3639562b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-websocket-client \
python314-websocket-client \
python314-websocket-client-test \
python3dist-websocket-client"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
