SUMMARY = "Shared library for evlib_ev plugin"
DESCRIPTION = "This package contains the shared library for the evlib_ev plugin, which \
lets applications drive libwebsockets from a libev event loop. Install it \
only if an application asks for it."
LICENSE = "MIT"

PV = "5.0.0"

RPM_NAME = "libwebsockets-evlib_ev-5.0.0-2.1.aarch64.rpm"
RPM_HASH = "1449c5917a3be9e00cda478b1e793d0f2c91601bdcf32c9e24e98c486771dd83f7eb1a089f8dfe1f37b5abe79544650ee8e8f80cb002125aee932df32924ff12"

RPROVIDES:${PN} += "libwebsockets-evlib-ev \
libwebsockets-evlib-ev.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libev.so.4 \
libwebsockets.so.22 \
libwebsockets22"

inherit rpm
