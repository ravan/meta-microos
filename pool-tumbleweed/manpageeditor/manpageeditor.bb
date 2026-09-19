SUMMARY = "A simple manual pages editor"
DESCRIPTION = "Create, edit, import, preview man-pages."
LICENSE = "GPL-3.0-only"

PV = "0.1.3"

RPM_NAME = "manpageeditor-0.1.3-1.19.aarch64.rpm"
RPM_HASH = "e99e56dbaa31c00b86773ad6b53d92dd2b69c70fdd4228f49e7248262888b08c1daa716464c73401106eb42ed8498dc9e5ca9e43413b57d1905efa26d2ef417b"

RPROVIDES:${PN} += "manpageeditor"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaspell.so.15 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtksourceview-3.0.so.1 \
libpango-1.0.so.0"

inherit rpm
