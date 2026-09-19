SUMMARY = "C++ Interface for Gio"
DESCRIPTION = "Glibmm is the official C++ interface for the popular cross-platform \
library Glib. It provides non-UI API that is not available in standard \
C++ and makes it possible for gtkmm to wrap GObject-based APIs."
LICENSE = "LGPL-2.1-or-later"

PV = "2.66.10"

RPM_NAME = "libgiomm-2_4-1-2.66.10-1.1.aarch64.rpm"
RPM_HASH = "76e1964e93266d3e3e8f1530a9619ffda1a792793f961422eb05c50c7a4f6c8076992a5b5685e96357cddda67a56f5dd014d2cacf4ea9f0501a55a14076e50f4"

RPROVIDES:${PN} += "libgiomm-2-4-1 \
libgiomm-2.4.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgobject-2.0.so.0 \
libsigc-2.0.so.0 \
libstdc++.so.6"

inherit rpm
