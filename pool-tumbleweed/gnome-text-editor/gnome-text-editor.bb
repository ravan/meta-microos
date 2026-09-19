SUMMARY = "GNOME Text Editor"
DESCRIPTION = "Text Editor is a simple text editor that focus on session \
management. It works hard to keep track of changes and state even \
if you quit the application. You can come back to your work even if \
you've never saved it to a file."
LICENSE = "GPL-3.0-or-later"

PV = "50.1"

RPM_NAME = "gnome-text-editor-50.1-1.2.aarch64.rpm"
RPM_HASH = "fbb1cb9c272d082e909a023b51e9efb6c540ccf5875f46ed718be542ff2b1772b765c68c5dc026e2fd4f743bd3052c901e085faa6f5a32483b38e8f0db3822e7"

RPROVIDES:${PN} += "gnome-text-editor"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libeditorconfig.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libgtksourceview-5.so.0 \
libpango-1.0.so.0 \
libspelling-1.so.2"

inherit rpm
