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

RPM_NAME = "python313-wsproto-1.3.2-1.3.noarch.rpm"
RPM_HASH = "9e5c1d5337828fe84e4f75ae15fc3900ec973b263d50ed4861aa893d8444d9b1038af051372e725c676d00d4e6a435090f837589e6b01756e92f9948c44a1325"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-wsproto \
python3.13dist-wsproto \
python313-wsproto \
python3dist-wsproto"

RDEPENDS:${PN} += "python-abi \
python313-h11"

inherit rpm
