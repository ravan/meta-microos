SUMMARY = "A simple WebDAV server program"
DESCRIPTION = "The chezdav package contains a simple tool to share a directory \
with WebDAV. The service is announced over mDNS for clients to discover."
LICENSE = "LGPL-2.0-or-later"

PV = "3.0"

RPM_NAME = "chezdav-3.0-3.13.aarch64.rpm"
RPM_HASH = "7ef6a069a007087d13166adb93fa792e767214de2733071adc3ede1daf6f5d87a19417433fed8c12614beaf17b1ab83a006ee1b0179eeb21fc4739a3acd19093"

RPROVIDES:${PN} += "chezdav"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libavahi-gobject.so.0 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libphodav-3.0.so.0 \
libsoup-3.0.so.0"

inherit rpm
