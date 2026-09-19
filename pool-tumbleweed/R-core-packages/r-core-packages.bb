SUMMARY = "Metapackage, requires all core Packages"
DESCRIPTION = "Metapackage, Requires: all core Packages"
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.6.1"

RPM_NAME = "R-core-packages-4.6.1-58.3.aarch64.rpm"
RPM_HASH = "a3e71c177c7cf0bcfb41a96b3f307a2f62f15b7cd4b255dbf9cf8d6b8f4b262df4ac5c19d8b65a3f65c7dc8b054a491fdffd9bcfddd63cdde3b6b861fe50a103"

RPROVIDES:${PN} += "R-core-packages"

RDEPENDS:${PN} += "R-compiler \
R-datasets \
R-grDevices \
R-graphics \
R-grid \
R-methods \
R-parallel \
R-splines \
R-stats \
R-stats4 \
R-tcltk \
R-tools \
R-utils"

inherit rpm
