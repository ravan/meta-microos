SUMMARY = "Static libraries for glib, a general-purpose utility library"
DESCRIPTION = "GLib is a general-purpose utility library, which provides many useful \
data types, macros, type conversions, string utilities, file utilities, \
a main loop abstraction, and so on. \
 \
This package contains static versions of the GLib libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "2.88.3"

RPM_NAME = "glib2-devel-static-2.88.3-1.1.aarch64.rpm"
RPM_HASH = "cd9394e18449be030e4bcfa4fcb5122e8b770508e4dcf7944125f6e9682e8fa9762ae44b56fb774d3a46222bc01bb4514e879f1efe61d3a50ec89d5511dd28ab"

RPROVIDES:${PN} += "glib2-devel-static"

RDEPENDS:${PN} += "glib2-devel"

inherit rpm
