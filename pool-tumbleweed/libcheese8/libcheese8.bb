SUMMARY = "Library implementing a webcam booth for GNOME"
DESCRIPTION = "Cheese is an application to take photos and videos with your webcam, \
with fun graphical effects."
LICENSE = "GPL-2.0-or-later"

PV = "44.1+12"

RPM_NAME = "libcheese8-44.1+12-1.6.aarch64.rpm"
RPM_HASH = "486b83c0b5c5a82dc356d94e7c98d6408d36858b5e826741155cb05ef7bd1f77f424226013c7063628a5e1cd3ab9a1e6c5a6fccbfe2716bac4961bfb18ffa60e"

RPROVIDES:${PN} += "libcheese.so.8 \
libcheese8"

RDEPENDS:${PN} += "/sbin/ldconfig \
gstreamer-plugins-bad \
gstreamer-plugins-good \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcheese-common \
libclutter-1.0.so.0 \
libclutter-gst-3.0.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0"

inherit rpm
