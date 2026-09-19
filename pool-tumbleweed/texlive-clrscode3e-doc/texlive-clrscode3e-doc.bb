SUMMARY = "Documentation for texlive-clrscode3e"
DESCRIPTION = "This package includes the documentation for texlive-clrscode3e"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn51137"

RPM_NAME = "texlive-clrscode3e-doc-2026.226.svn51137-60.2.noarch.rpm"
RPM_HASH = "9bf089cdec4faaba7b87ed6b4b78d7c434dda722ea5cf75f999a2bc407dc0cecda998096b5c893c0a6fe3603c51b0688ce2d469d5f22f71c58f85cf95a77bf09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-clrscode3e-doc"

RDEPENDS:${PN} += ""

inherit rpm
