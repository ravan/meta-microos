SUMMARY = "Mousepad plugin provider"
DESCRIPTION = "A plugin provider for the Mousepad text editor"
LICENSE = "GPL-2.0-or-later"

PV = "0.7.0"

RPM_NAME = "libmousepad0-0.7.0-1.2.aarch64.rpm"
RPM_HASH = "ecdc2bb6c9a66c4aca7f2a004f6bf0c6dff4c281a41c89215c2238d98beb0bd1d9cb9917ad18e135fb9ae0573316e5506d1b04388871d46eb0ceabc298f1a947"

RPROVIDES:${PN} += "libmousepad.so.0 \
libmousepad0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtksourceview-4.so.0 \
libpango-1.0.so.0 \
mousepad"

inherit rpm
