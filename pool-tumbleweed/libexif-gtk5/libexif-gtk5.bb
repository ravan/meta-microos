SUMMARY = "GTK Widgets for Viewing EXIF Information"
DESCRIPTION = "This library contains GTK widgets for viewing EXIF information within \
JPEG images created by some digital cameras."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.0"

RPM_NAME = "libexif-gtk5-0.5.0-2.6.aarch64.rpm"
RPM_HASH = "35e17b0257fde5982cbb51575830a1a6567c8f89da825e35f88878486dab927d9799bcf2c24f4bb3b2780dce110a2bb835e86f201c3f5db6e008651ef0f62c88"

RPROVIDES:${PN} += "libexif-gtk.so.5 \
libexif-gtk5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexif-gtk \
libexif.so.12 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
