SUMMARY = "GAP: Interfacing the geometry software polymake"
DESCRIPTION = "A very basic GAP-interface to the program 'polymake' by Ewgenij \
Gawrilow and Michael Joswi."
LICENSE = "GPL-2.0-only"

PV = "0.8.9"

RPM_NAME = "gap-polymaking-0.8.9-1.2.noarch.rpm"
RPM_HASH = "4a222c6477ea351d3deaba306d41b30555e51434687c5c1b5e383f29976cdc40714f24bfbefd56c44c8f7a8a35a9cf274d2b8ecdd4d0cca09b0a9af89860f789"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-polymaking"

RDEPENDS:${PN} += "gap-core \
polymake"

inherit rpm
