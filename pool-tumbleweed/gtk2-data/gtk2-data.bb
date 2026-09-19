SUMMARY = "Data files for the GTK+ toolkit library v2"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites."
LICENSE = "LGPL-2.1-or-later"

PV = "2.24.33"

RPM_NAME = "gtk2-data-2.24.33-18.7.noarch.rpm"
RPM_HASH = "5b58946102b7e15b4a867161914dfa06246ab94220b3aaa7671bdb8d062b293f2fafd4ba0c16689654c30d6fc5ebf7abe6ca231d986639cd80f12efaa0684e37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-data"

RDEPENDS:${PN} += ""

inherit rpm
