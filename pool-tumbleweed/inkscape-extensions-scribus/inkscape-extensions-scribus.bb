SUMMARY = "Scribus extensions for Inkscape"
DESCRIPTION = "The Scribus-based PDF export extension for Inkscape. \
 \
Inkscape is a vector graphics editor."
LICENSE = "GPL-3.0-only"

PV = "1.4.4+git2.3454cb1dab"

RPM_NAME = "inkscape-extensions-scribus-1.4.4+git2.3454cb1dab-1.2.aarch64.rpm"
RPM_HASH = "b6bcdb25e7f066cb51f4cef66b298ce8f90752a2fc665ad0405bcc84faffdbc88e68da7032417c33cdbf508617e633906f22bc181e61d3e47c71656fad5d36f3"

RPROVIDES:${PN} += "inkscape-extensions-scribus"

RDEPENDS:${PN} += "inkscape \
inkscape-extensions-extra \
scribus"

inherit rpm
