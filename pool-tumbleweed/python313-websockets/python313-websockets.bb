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

RPM_NAME = "python313-websockets-16.0-2.2.aarch64.rpm"
RPM_HASH = "4803ce5be034a0a9d7f649c2cad52440df1fe07f0860624c68ce6f7cf47287d7aa53e935a4f804775a43518f6d4df2f9a9275933927d48b1cdf1e7a936631132"

RPROVIDES:${PN} += "python3-websockets \
python3.13dist-websockets \
python313-websockets \
python3dist-websockets"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
