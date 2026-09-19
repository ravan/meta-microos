SUMMARY = "Documentation for texlive-chordbox"
DESCRIPTION = "This package includes the documentation for texlive-chordbox"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn51000"

RPM_NAME = "texlive-chordbox-doc-2026.226.1.0svn51000-60.2.noarch.rpm"
RPM_HASH = "55b10be489089204f369383e7ee627f6a82e13358128c9d3ee26d9a46c313b1ad66e85619a033fa6af3f474b3fce0c0c81e220e905957caa0437378ee390f49e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chordbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
