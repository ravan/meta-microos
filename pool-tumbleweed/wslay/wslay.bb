SUMMARY = "WebSocket library in C"
DESCRIPTION = "Wslay is a WebSocket library written in C. It implements the protocol version \
13 described in RFC 6455. This library offers 2 levels of API: event-based API \
and frame-based low-level API. For event-based API, it is suitable for \
non-blocking reactor pattern style. You can set callbacks in various events. \
For frame-based API, you can send WebSocket frame directly. Wslay only supports \
data transfer part of WebSocket protocol and does not perform opening handshake \
in HTTP. \
 \
Wslay supports: \
 \
Text/Binary messages. \
Automatic ping reply. \
Callback interface. \
External event loop. \
 \
Wslay does not perform any I/O operations for its own. Instead, it offers \
callbacks for them. This makes Wslay independent on any I/O frameworks, SSL, \
sockets, etc. This makes Wslay portable across various platforms and the \
application authors can choose freely I/O frameworks."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "wslay-1.1.1-2.20.aarch64.rpm"
RPM_HASH = "0c4130afe33264317d4407ac045d97462178bdd53d3320c71dc0e85d196c9a8aed4a8c9448a71eb634d58a51ad336436840da5a92d684f170a92a1ef363d7a2f"

RPROVIDES:${PN} += "wslay"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libnettle.so.8 \
libstdc++.so.6 \
libwslay.so.0"

inherit rpm
