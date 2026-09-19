SUMMARY = "Git repository viewer -- Catalog for Glade"
DESCRIPTION = "gitg is a GitX clone for GNOME/gtk+. It aims at being a small, fast and \
convenient tool to visualize git history and actions that benefit from a \
graphical presentation. \
 \
This package provides a catalog for Glade, to allow the use the gitg \
widgets in Glade."
LICENSE = "GPL-2.0-or-later"

PV = "50"

RPM_NAME = "glade-catalog-gitg-50-1.1.aarch64.rpm"
RPM_HASH = "288460a4d784cb72db38dc8067bd210a78ad366f94013eee161d3cd78bd5db2f7a730d42df88cd886168271852db6812720b6f9fd24792059551b39a1ce510c3"

RPROVIDES:${PN} += "glade-catalog-gitg"

RDEPENDS:${PN} += "glade \
libgitg-1-0-0"

inherit rpm
