SUMMARY = "General-Purpose Utility Library"
DESCRIPTION = "GLib is a general-purpose utility library, which provides many useful \
data types, macros, type conversions, string utilities, file utilities, \
a main loop abstraction, and so on."
LICENSE = "LGPL-2.1-or-later"

PV = "2.88.3"

RPM_NAME = "glib2-doc-2.88.3-1.1.aarch64.rpm"
RPM_HASH = "23a38751f73cc1359697861e7e70a40ff887f9fd26d2f430f1844c1cff1f7e07ce4c8ea7644102e6abdc12d026d2b2b511a55e57dec356014bb0a630a0e0ceea"

RPROVIDES:${PN} += "glib2-devel-/usr/share/gtk-doc/html/gobject/index.html \
glib2-doc"

RDEPENDS:${PN} += ""

inherit rpm
