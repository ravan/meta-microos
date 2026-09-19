SUMMARY = "Caja extension for the ACL viewer and editor"
DESCRIPTION = "A Caja extension that allows viewing and editing ACL permissions."
LICENSE = "GPL-2.0-or-later"

PV = "1.20.1"

RPM_NAME = "caja-extension-eiciel-1.20.1-2.22.aarch64.rpm"
RPM_HASH = "44396bb5e9cff7780ec6369254135ad532c916e0629966739b892a04ea7026caf28f394730545d7cb458d1b1ff2df2cb30037febba1c138f1d105bfb213ad02a"

RPROVIDES:${PN} += "caja-extension-eiciel \
libeiciel-caja.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libacl.so.1 \
libatkmm-1.6.so.1 \
libc.so.6 \
libcairomm-1.0.so.1 \
libcaja-extension.so.1 \
libgcc-s.so.1 \
libgdkmm-3.0.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtkmm-3.0.so.1 \
libsigc-2.0.so.0 \
libstdc++.so.6 \
mate-eiciel"

inherit rpm
