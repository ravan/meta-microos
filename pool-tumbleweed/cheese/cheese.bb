SUMMARY = "Webcam Booth for GNOME"
DESCRIPTION = "Cheese is an application to take photos and videos with your webcam, \
with fun graphical effects."
LICENSE = "GPL-2.0-or-later"

PV = "44.1+12"

RPM_NAME = "cheese-44.1+12-1.6.aarch64.rpm"
RPM_HASH = "4834980bc3aa929fdf2303e178dc763a1feeee08bf3978b219c5ee32e061699ea602579952d40db00b072d32b1276de77cc4665e0ce86b4938afda9ab51b4ece"

RPROVIDES:${PN} += "cheese"

RDEPENDS:${PN} += "gnome-video-effects \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcanberra-gtk3.so.0 \
libcheese-gtk.so.25 \
libcheese.so.8 \
libclutter-1.0.so.0 \
libclutter-gtk-1.0.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnome-desktop-3.so.20 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libgtk-3.so.0"

inherit rpm
