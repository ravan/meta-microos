SUMMARY = "A GTK Digital Camera Tool"
DESCRIPTION = "GTKam is a GTK and GNOME based tool for accessing a digital camera, \
viewing thumbnails, and downloading pictures from the camera."
LICENSE = "GPL-2.0-or-later"

PV = "1.1"

RPM_NAME = "gtkam-1.1-4.4.aarch64.rpm"
RPM_HASH = "0f224c5ebf9bc8f8fa90f3410a7cf9bda9139f4fd456e1d73ae21db9af2b8a1564c20e2cdd59d06e0d67f3877afaaee605bd73a6dd0c14a85c9cc6ed4092671a"

RPROVIDES:${PN} += "gtkam"

RDEPENDS:${PN} += "gtkam-lang \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexif-gtk.so.5 \
libexif.so.12 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgphoto2-port.so.12 \
libgphoto2.so.6 \
libgtk-x11-2.0.so.0 \
libm.so.6"

inherit rpm
