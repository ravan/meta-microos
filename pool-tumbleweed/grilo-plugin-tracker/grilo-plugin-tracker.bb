SUMMARY = "Tracker plugin for the Grilo framework"
DESCRIPTION = "Grilo is a framework for browsing and searching media content from \
various sources using a single API."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.18"

RPM_NAME = "grilo-plugin-tracker-0.3.18-2.3.aarch64.rpm"
RPM_HASH = "a9249309642b7f8b703c18495d62c99475b2e8d5e9c8559451cdc692ad6c2311060078c77c8b255f84de369eef2741bead61cee624e783794bc6ebdc12dafbea"

RPROVIDES:${PN} += "grilo-plugin-tracker \
libgrltracker3.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgrilo-0.3.so.0 \
libtinysparql-3.0.so.0"

inherit rpm
