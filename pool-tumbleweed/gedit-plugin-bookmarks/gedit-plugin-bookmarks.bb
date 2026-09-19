SUMMARY = "Gedit bookmarks plugin"
DESCRIPTION = "The gedit bookmarks plugin."
LICENSE = "GPL-2.0-or-later"

PV = "50.0"

RPM_NAME = "gedit-plugin-bookmarks-50.0-1.2.aarch64.rpm"
RPM_HASH = "0f83eb1bb07eca6f1d8bb8b1e84a1b3fef6e541629a08b9b97f64b3ce8f6b338b3cbbf05dc2f82a5dce85d0e041b0a9973f0befd8755705d34162127e4772e33"

RPROVIDES:${PN} += "gedit-plugin-bookmarks \
gedit-plugins-/usr/lib64/gedit/plugins/bookmarks.plugin \
libbookmarks.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgedit-50.so \
libgedit-gtksourceview-300.so.5 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpeas-1.0.so.1"

inherit rpm
