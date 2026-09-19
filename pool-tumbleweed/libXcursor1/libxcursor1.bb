SUMMARY = "X Window System Cursor management library"
DESCRIPTION = "Xcursor a library designed to help locate and load cursors. Cursors \
can be loaded from files or memory. A library of common cursors \
exists which map to the standard X cursor names.Cursors can exist in \
several sizes and the library automatically picks the best size."
LICENSE = "MIT"

PV = "1.2.3"

RPM_NAME = "libXcursor1-1.2.3-1.8.aarch64.rpm"
RPM_HASH = "000b4c948b49362cb9fb6edff01732d3921cd717e46f2e3a7d783b552aa206e9fa617bd294f315ef0c7df72023369c1a44fd4faaa93ec9aca825ae4350613444"

RPROVIDES:${PN} += "libXcursor.so.1 \
libXcursor1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXfixes.so.3 \
libXrender.so.1 \
libc.so.6"

inherit rpm
