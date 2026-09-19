SUMMARY = "C++ Interface for Gio"
DESCRIPTION = "Glibmm is the official C++ interface for the popular cross-platform \
library Glib. It provides non-UI API that is not available in standard \
C++ and makes it possible for gtkmm to wrap GObject-based APIs."
LICENSE = "LGPL-2.1-or-later"

PV = "2.88.1"

RPM_NAME = "libgiomm-2_68-1-2.88.1-1.2.aarch64.rpm"
RPM_HASH = "e4d6f13b4b060c2bfb54261d707df7f3295a7fe2f4ec4ef270d0cf0e9e8ae4658681c30afcccc494d357af51779d15fbb3162329838de07562a084c647b28fae"

RPROVIDES:${PN} += "libgiomm-2-68-1 \
libgiomm-2.68.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libglibmm-2.68.so.1 \
libgobject-2.0.so.0 \
libsigc-3.0.so.0 \
libstdc++.so.6"

inherit rpm
