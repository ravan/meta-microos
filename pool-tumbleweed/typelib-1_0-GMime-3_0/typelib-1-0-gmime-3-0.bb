SUMMARY = "MIME Parser and Utility Library -- Introspection bindings"
DESCRIPTION = "GMime is a C/C++ library for parsing and creating messages using \
the Multipurpose Internet Mail Extension (MIME)."
LICENSE = "LGPL-2.1-or-later"

PV = "3.2.15"

RPM_NAME = "typelib-1_0-GMime-3_0-3.2.15-1.7.aarch64.rpm"
RPM_HASH = "7a448ef8c37b0e900c46c3ae6d9dbcad198a82e154fa6061dd879fc35e0519ce070425c25d6d5f5a5004c3759c3a0c52806646a5cb5cd749aacdc976d8727b22"

RPROVIDES:${PN} += "typelib-1-0-GMime-3-0 \
typelib-GMime"

RDEPENDS:${PN} += "libgmime-3.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
