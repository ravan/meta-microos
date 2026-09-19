SUMMARY = "Documentation for texlive-latex-git-log"
DESCRIPTION = "This package includes the documentation for texlive-latex-git-log"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.1.0svn71402"

RPM_NAME = "texlive-latex-git-log-doc-2026.226.1.1.0svn71402-63.2.noarch.rpm"
RPM_HASH = "bce0b13e2df9c86a5e827660921e4343743cc3c3d541e0a6aebc62df7abe2980d04ceb2d6094002aa96f5330bb71d9ae5943fcbf5b3dabde0a2b5fdbc5a9e0e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-latex-git-log.1 \
texlive-latex-git-log-doc"

RDEPENDS:${PN} += ""

inherit rpm
