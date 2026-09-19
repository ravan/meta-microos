SUMMARY = "Framework for browsing and searching media content -- Playlist Helper Library"
DESCRIPTION = "Grilo is a framework for browsing and searching media content from \
various sources using a single API."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.19"

RPM_NAME = "libgrlpls-0_3-0-0.3.19-2.5.aarch64.rpm"
RPM_HASH = "fbf8f9b025192466c3105f1bd6ddeb31aac793ded561bf78c6bd2ae1c9b58e3d7939a6a9bc0bacc30c60563c0e812ee1eb4a015e7c0d3424d52e9cc2692ac386"

RPROVIDES:${PN} += "libgrlpls-0-3-0 \
libgrlpls-0.3.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgrilo-0.3.so.0 \
libtotem-plparser.so.18"

inherit rpm
