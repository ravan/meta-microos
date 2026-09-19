SUMMARY = "C++ Interface for Glib"
DESCRIPTION = "Glibmm is the official C++ interface for the popular cross-platform \
library Glib. It provides non-UI API that is not available in standard \
C++ and makes it possible for gtkmm to wrap GObject-based APIs."
LICENSE = "LGPL-2.1-or-later"

PV = "2.66.10"

RPM_NAME = "libglibmm-2_4-1-2.66.10-1.1.aarch64.rpm"
RPM_HASH = "3f375514546b41559da861862fa3574dbdac215e06e4f111c1288c9fd014c00330a3f29b530e060b4829e3537561dabc90707d6679686f61446a4c2f020e76b8"

RPROVIDES:${PN} += "glibmm2 \
glibmm24 \
libglibmm-2-4-1 \
libglibmm-2.4.so.1 \
libglibmm-generate-extra-defs-2.4.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libsigc-2.0.so.0 \
libstdc++.so.6"

inherit rpm
