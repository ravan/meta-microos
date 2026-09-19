SUMMARY = "Library with common API for various MATE modules"
DESCRIPTION = "This package contains the library with common API for various \
MATE modules."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "1.28.2"

RPM_NAME = "mate-desktop-1.28.2-1.13.aarch64.rpm"
RPM_HASH = "38c8507d2e1b5369f537f1611041deb592f53d8c99a934412d3998de593ef4713ff8593997937cdbc0dffb84e218274d8bab552641eaf8d73261df9cf106842a"

RPROVIDES:${PN} += "mate-desktop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libmate-desktop-2.so.17 \
xdg-user-dirs"

inherit rpm
