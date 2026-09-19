SUMMARY = "Library providing an advanced widget for GdkPixbuf"
DESCRIPTION = "GtkImageView is a widget that provides a zoomable and panable view of a \
GdkPixbuf. It is intended to be usable in most types of image viewing \
applications."
LICENSE = "LGPL-2.0-or-later"

PV = "1.6.4"

RPM_NAME = "libgtkimageview0-1.6.4-23.10.aarch64.rpm"
RPM_HASH = "65498f6d749e9d003750a349d8ab94b4dad7563e72c5a8360d876428ed4a5d1e130633524ca23f182132acaf19a56c19ef4f63255e81dea233a336f6db169191"

RPROVIDES:${PN} += "libgtkimageview.so.0 \
libgtkimageview0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
