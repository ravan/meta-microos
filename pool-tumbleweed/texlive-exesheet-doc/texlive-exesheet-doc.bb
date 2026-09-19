SUMMARY = "Documentation for texlive-exesheet"
DESCRIPTION = "This package includes the documentation for texlive-exesheet"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.9svn75102"

RPM_NAME = "texlive-exesheet-doc-2026.226.2.9svn75102-59.2.noarch.rpm"
RPM_HASH = "a0947c0744380d3e871785a8116a5ed99dd0bd573ecfc3ad92e15b2713896587d8c4dccc305fd65d804e809d3a38a773dfce4b22c81ec53eeda846b24dfc482c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-exesheet-doc"

RDEPENDS:${PN} += ""

inherit rpm
