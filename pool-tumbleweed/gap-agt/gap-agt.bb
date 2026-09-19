SUMMARY = "GAP: Algebraic Graph Theory"
DESCRIPTION = "The AGT package contains a methods used for the determination of \
various algebraic and regularity properties of graphs, as well as \
certain substructures of graphs. The package also contains a library \
of strongly regular graphs, intended to be a resource for \
computational experiments."
LICENSE = "Artistic-2.0"

PV = "0.3.1"

RPM_NAME = "gap-agt-0.3.1-1.7.noarch.rpm"
RPM_HASH = "aa71c345839480ed50cc64fc5ec785fb18e489b5f1b0b7b76269e5e6fb2fda819750a72cdaa0f70d1562f8549dda1ac5bf35f55cb92918434ccb88b87ca42335"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-agt"

RDEPENDS:${PN} += "gap-core \
gap-design \
gap-digraphs \
gap-gapdoc \
gap-grape"

inherit rpm
