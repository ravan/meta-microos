SUMMARY = "GTK+3 timezone map widget"
DESCRIPTION = "Timezone map widget for GTK+3."
LICENSE = "GPL-3.0-only"

PV = "0.4.6"

RPM_NAME = "libtimezonemap1-0.4.6-1.11.aarch64.rpm"
RPM_HASH = "b826c0153cc55c07f0479fb2441f8e6ae1c3f1a089f9a17490b7c15e15c0848ef24b17dd6bc9efee75fbf974a9f7a81cab8ec93a699673bfbfb6a13defc128b5"

RPROVIDES:${PN} += "libtimezonemap.so.1 \
libtimezonemap1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libjson-glib-1.0.so.0 \
libm.so.6 \
libsoup-2.4.so.1"

inherit rpm
