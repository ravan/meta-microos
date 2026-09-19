SUMMARY = "An implementation of the WebSocket Protocol (RFC 6455)"
DESCRIPTION = "WebSockets is a library for developing WebSocket servers_ and clients_ in \
Python. It implements RFC 6455 with a focus on correctness and simplicity. \
It passes the Autobahn Testsuite. \
 \
Built on top of Python's asynchronous I/O support introduced in PEP 3156, \
it provides an API based on coroutines, making it easy to write highly \
concurrent applications."
LICENSE = "BSD-3-Clause"

PV = "16.0"

RPM_NAME = "python314-websockets-16.0-2.2.aarch64.rpm"
RPM_HASH = "80b0c737d7014cc6f7db2717f8c5907f272bca5822f0d9d5b61c8768309e5b58de4d9171df743662366693bf94fdad532007430ed23767e131d2ed4b48c72f74"

RPROVIDES:${PN} += "python3.14dist-websockets \
python314-websockets \
python3dist-websockets"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
