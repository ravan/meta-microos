SUMMARY = "Shared library for evlib_glib plugin"
DESCRIPTION = "This package contains the shared library for the evlib_glib plugin, which \
lets applications drive libwebsockets from a glib event loop. Install it \
only if an application asks for it."
LICENSE = "MIT"

PV = "5.0.0"

RPM_NAME = "libwebsockets-evlib_glib-5.0.0-2.1.aarch64.rpm"
RPM_HASH = "7c9af57c22712569cfd1c16521c5e4eeade95f8a20bf59b80346ced9451c6ead7afe6e8dfcc7831e415480d7236b0c124c9bc76aa2d3577238ff277474d6ef1e"

RPROVIDES:${PN} += "libwebsockets-evlib-glib \
libwebsockets-evlib-glib.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libwebsockets.so.22 \
libwebsockets22"

inherit rpm
