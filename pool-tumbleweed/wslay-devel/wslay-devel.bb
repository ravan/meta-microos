SUMMARY = "Development files for the wslay WebSockets library"
DESCRIPTION = "Wslay is a WebSocket library written in C. It implements the protocol version \
13 described in RFC 6455. This library offers 2 levels of API: event-based API \
and frame-based low-level API. For event-based API, it is suitable for \
non-blocking reactor pattern style. You can set callbacks in various events. \
For frame-based API, you can send WebSocket frame directly. Wslay only supports \
data transfer part of WebSocket protocol and does not perform opening handshake \
in HTTP. \
 \
This package holds the development files."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "wslay-devel-1.1.1-2.20.aarch64.rpm"
RPM_HASH = "fc968d75b4c7856773d494bb18ba23d6b9803e8b02e3f1f82b46a0e4067aa73fb5f807134e7d99add32ae5dcf59ec0e07f41b4108c08e6a18e73b99584074632"

RPROVIDES:${PN} += "pkgconfig-libwslay \
wslay-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwslay0"

inherit rpm
