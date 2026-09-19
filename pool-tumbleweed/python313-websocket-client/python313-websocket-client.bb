SUMMARY = "WebSocket client implementation"
DESCRIPTION = "The websocket-client module is a WebSocket client for Python. This provides the \
low-level APIs for WebSocket. All APIs are synchronous functions. \
 \
Websocket-client supports only hybi-13."
LICENSE = "Apache-2.0"

PV = "1.9.0"

RPM_NAME = "python313-websocket-client-1.9.0-2.4.noarch.rpm"
RPM_HASH = "a3b20bf36a42412897770321abc885fbce17215a39d0b31895719bf5354284b51296b47e7772590beda8303c13d5da848690bbb1198f2a5a8a17a120891e8423"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-websocket-client \
python3-websocket-client-test \
python3.13dist-websocket-client \
python313-websocket-client \
python313-websocket-client-test \
python3dist-websocket-client"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
