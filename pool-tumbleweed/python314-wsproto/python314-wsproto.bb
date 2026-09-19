SUMMARY = "WebSockets state-machine based protocol implementation"
DESCRIPTION = "This module contains a pure-Python implementation of a WebSocket \
protocol stack. It's written from the ground up to be embeddable in \
whatever program you choose to use, ensuring that you can \
communicate via WebSockets, as defined in RFC6455 \
<https://tools.ietf.org/html/rfc6455>, regardless of your \
programming paradigm. \
 \
This module does not provide a parsing layer, a network layer, or \
any rules about concurrency. Instead, it's a purely in-memory \
solution, defined in terms of data actions and WebSocket frames. \
RFC6455 and Compression Extensions for WebSocket via RFC7692 \
<https://tools.ietf.org/html/rfc7692> are fully supported."
LICENSE = "MIT"

PV = "1.3.2"

RPM_NAME = "python314-wsproto-1.3.2-1.3.noarch.rpm"
RPM_HASH = "5d28c08e8edf2bf6fbf325aff4f166dd9f7d2c029836b53f684e98a2b0921d1acab9b893dcf217866966c2c29c3a816ffd262a3143756d400c382e541789b41c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-wsproto \
python314-wsproto \
python3dist-wsproto"

RDEPENDS:${PN} += "python-abi \
python314-h11"

inherit rpm
