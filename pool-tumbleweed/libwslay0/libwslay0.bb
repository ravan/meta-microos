SUMMARY = "WebSockets C Library"
DESCRIPTION = "Wslay is a WebSocket library written in C. It implements the protocol version \
13 described in RFC 6455. This library offers 2 levels of API: event-based API \
and frame-based low-level API. For event-based API, it is suitable for \
non-blocking reactor pattern style. You can set callbacks in various events. \
For frame-based API, you can send WebSocket frame directly. Wslay only supports \
data transfer part of WebSocket protocol and does not perform opening handshake \
in HTTP. \
 \
This package holds the shared C library."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "libwslay0-1.1.1-2.20.aarch64.rpm"
RPM_HASH = "acda844a3d711a4b7999f077265fe2caa9f13336764b5175323db77c3265edd60cd556f23f6be34cf1bb799a365bc533f55ee5a7ed2395e12f03aae632cc5d40"

RPROVIDES:${PN} += "libwslay.so.0 \
libwslay0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
