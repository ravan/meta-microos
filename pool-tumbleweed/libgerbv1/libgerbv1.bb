SUMMARY = "Gerber File Viewer library"
DESCRIPTION = "Gerbv library, allows developers to include parsing, editing, exporting, \
rendering of Gerber files into other programs."
LICENSE = "GPL-2.0-only"

PV = "2.13.0"

RPM_NAME = "libgerbv1-2.13.0-3.1.aarch64.rpm"
RPM_HASH = "9c67fcb5b9317c24328bdecb8385ae6baab13b80fb9a1f77e9ef93266aa233b743c51d0677c16207578e4094a50cc8c45a8387d9376cce1a12bf0109ab0c0fff"

RPROVIDES:${PN} += "libgerbv.so.1 \
libgerbv1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
