SUMMARY = "Documentation for texlive-tikzfill"
DESCRIPTION = "This package includes the documentation for texlive-tikzfill"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.1svn76924"

RPM_NAME = "texlive-tikzfill-doc-2026.226.1.0.1svn76924-59.2.noarch.rpm"
RPM_HASH = "e3bb5f258a58a355ed987fa72a0272598b31efac81e2337688b59afb98eaca7d26cf309cb635ceb7fca8787d6944f32083ea517fb21b6ee246faa56071138846"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikzfill-doc"

RDEPENDS:${PN} += ""

inherit rpm
