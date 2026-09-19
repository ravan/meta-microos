SUMMARY = "Documentation of the OpenGL Extension to GTK"
DESCRIPTION = "This package contains additional documentation for gtkglext. \
 \
GtkGLExt is an OpenGL extension to GTK. It provides the GDK objects \
which support OpenGL rendering in GTK, and GtkWidget API add-ons to \
make GTK+ widgets OpenGL-capable."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.0git20110529"

RPM_NAME = "gtkglext-doc-1.2.0git20110529-8.12.aarch64.rpm"
RPM_HASH = "a91c91b8407e1a8f600c9c340ccc45f95697d8d02a2b49426857e914868b9d4df807494b9d6baf214672779b03f79afe14d392bd21207e32dd8d3affe35b22dd"

RPROVIDES:${PN} += "gtkglext-doc"

RDEPENDS:${PN} += "libgtkglext-x11-1-0-0"

inherit rpm
