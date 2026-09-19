SUMMARY = "Data files for the GTK+ toolkit library v3"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.52+git59.b30343717d"

RPM_NAME = "gtk3-data-3.24.52+git59.b30343717d-1.1.noarch.rpm"
RPM_HASH = "71315634cd72ddd36c78af35804533c83d36f63541449d788dc34e93f29dca032d1a91abe790db6491c6278d06426c351492c4a5272339e3f9a72fd5938b7c80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk3-data"

RDEPENDS:${PN} += ""

inherit rpm
