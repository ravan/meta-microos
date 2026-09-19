SUMMARY = "Fig import extensions for Inkscape"
DESCRIPTION = "Fig family (XFig, Figurine, JFig, WinFig,...) import extension for \
Inkscape. \
 \
Inkscape is a vector graphics editor."
LICENSE = "GPL-3.0-only"

PV = "1.4.4+git2.3454cb1dab"

RPM_NAME = "inkscape-extensions-fig-1.4.4+git2.3454cb1dab-1.2.aarch64.rpm"
RPM_HASH = "7ac1c7b4c945bd602465821135fcb26db0282fd61bfeffd2183df07512eda833247338f229334f89648ef7f563928ef6f0ef4864d7f4926ac67574dab10dca26"

RPROVIDES:${PN} += "inkscape-extensions-fig"

RDEPENDS:${PN} += "inkscape \
inkscape-extensions-extra \
transfig"

inherit rpm
