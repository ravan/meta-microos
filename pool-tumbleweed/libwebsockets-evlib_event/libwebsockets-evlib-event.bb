SUMMARY = "Shared library for evlib_event plugin"
DESCRIPTION = "This package contains the shared library for the evlib_event plugin, which \
lets applications drive libwebsockets from a libevent event loop. Install it \
only if an application asks for it."
LICENSE = "MIT"

PV = "5.0.0"

RPM_NAME = "libwebsockets-evlib_event-5.0.0-2.1.aarch64.rpm"
RPM_HASH = "b6221f12fe18ad5fe4b0f45afe54a0622d4e738ac0a06a6daba49befa8d83e1e82cf7f49cf99aacc64dd9f193af20e474ac54c21b1af750242c9fb3e11b621be"

RPROVIDES:${PN} += "libwebsockets-evlib-event \
libwebsockets-evlib-event.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libevent-2.1.so.7 \
libwebsockets.so.22 \
libwebsockets22"

inherit rpm
