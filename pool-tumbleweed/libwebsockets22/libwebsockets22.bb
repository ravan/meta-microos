SUMMARY = "A WebSockets library written in C"
DESCRIPTION = "Libwebsockets covers some features for people making embedded \
HTTP/WebSocket servers or clients. \
 \
* HTTP(S) serving and client operation \
* WS(S) serving and client operation \
* HTTP(S) APIs for file transfer and upload \
* HTTP POST form handling (including multipart) \
* Cookie-based sessions \
* Account management (including registration, email verification, \
  lost password, etc.) \
* SSL PFS support"
LICENSE = "MIT"

PV = "5.0.0"

RPM_NAME = "libwebsockets22-5.0.0-2.1.aarch64.rpm"
RPM_HASH = "dcb557a2f20fed38fe45650a75c120a186ad1e6df25321a2839ab5dcc4c2191ce3e2720d15bc0745e33524485982bf4e33fd307ecd5e2881e07051b21ce18571"

RPROVIDES:${PN} += "libwebsockets.so.22 \
libwebsockets22"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libdbus-1.so.3 \
libsqlite3.so.0 \
libssl.so.3 \
libwebsockets-evlib-uv \
libz.so.1"

inherit rpm
