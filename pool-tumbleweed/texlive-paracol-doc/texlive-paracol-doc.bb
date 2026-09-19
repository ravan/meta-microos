SUMMARY = "Documentation for texlive-paracol"
DESCRIPTION = "This package includes the documentation for texlive-paracol"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.37svn77682"

RPM_NAME = "texlive-paracol-doc-2026.226.1.37svn77682-58.2.noarch.rpm"
RPM_HASH = "cb5a4cc83968b46a54043c6d789d1c40a6ecd2412ec4436adfe78179f48f3125397a9ec21511d1411bfba571fa2083b177a277cb8f86f1fed36a42ca9b0ec448"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-paracol-doc"

RDEPENDS:${PN} += ""

inherit rpm
