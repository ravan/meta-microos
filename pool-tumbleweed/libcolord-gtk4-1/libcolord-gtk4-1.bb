SUMMARY = "System Daemon for Managing Color Devices -- GTK Integration Library"
DESCRIPTION = "colord is a system activated daemon that maps devices to color profiles. \
It is used by gnome-color-manager for system integration and use when \
there are no users logged in."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.1"

RPM_NAME = "libcolord-gtk4-1-0.3.1-1.6.aarch64.rpm"
RPM_HASH = "5c992a658013e29e273607887796a43ac6414f66ec04eafe003d765d7305b41cbdffafcb8698dbe7ea557b4d6564c328867d17e83f6138023aeb9b802642443a"

RPROVIDES:${PN} += "libcolord-gtk4-1 \
libcolord-gtk4.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libcolord.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1"

inherit rpm
