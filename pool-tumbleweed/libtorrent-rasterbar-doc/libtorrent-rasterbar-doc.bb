SUMMARY = "Documentation for libtorrent-rasterbar"
DESCRIPTION = "Documentation for the libtorrent-rasterbar package."
LICENSE = "BSD-3-Clause"

PV = "2.0.14"

RPM_NAME = "libtorrent-rasterbar-doc-2.0.14-1.1.noarch.rpm"
RPM_HASH = "00b1d0dacbd4a8795b80a3fdc2b6d60bacccd4d8d64694c6983fa2eb7ddd2f59354f835901fac9e654ddc2365f5faa0f8efd24dbb2d44e6228d5153598cb76c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libtorrent-rasterbar-doc"

RDEPENDS:${PN} += ""

inherit rpm
