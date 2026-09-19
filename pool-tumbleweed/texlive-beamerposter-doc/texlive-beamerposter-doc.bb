SUMMARY = "Documentation for texlive-beamerposter"
DESCRIPTION = "This package includes the documentation for texlive-beamerposter"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.13svn77682"

RPM_NAME = "texlive-beamerposter-doc-2026.226.1.13svn77682-61.2.noarch.rpm"
RPM_HASH = "84fd95d7d7c5bca66a13465fec1182e9a155f75c001afbcada5192a43af2b4f5779d04f225069613f9fbb44b9f61e51bcad682e74486a84319f982f17f46add2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamerposter-doc"

RDEPENDS:${PN} += ""

inherit rpm
