SUMMARY = "GTK media player component"
DESCRIPTION = "A modern media player powered by GStreamer and built for the GNOME desktop environment."
LICENSE = "LGPL-2.1-or-later"

PV = "0.10.0"

RPM_NAME = "libclapper-gtk-0_0-0-0.10.0-1.4.aarch64.rpm"
RPM_HASH = "be571df213f79ab8307c0fbf056934fed08d0f642b6d1456d654fd596dcdb9ad9b9d437d45415053eddc44266a40b92a96f3a60cba5721566ec53d359e6c0444"

RPROVIDES:${PN} += "libclapper-gtk-0-0-0 \
libclapper-gtk-0.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libclapper-0-0-0 \
libclapper-0.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libgtk-4.so.1"

inherit rpm
