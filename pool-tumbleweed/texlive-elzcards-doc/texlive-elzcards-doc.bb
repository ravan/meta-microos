SUMMARY = "Documentation for texlive-elzcards"
DESCRIPTION = "This package includes the documentation for texlive-elzcards"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.60svn51894"

RPM_NAME = "texlive-elzcards-doc-2026.226.1.60svn51894-61.4.noarch.rpm"
RPM_HASH = "6bd68c288bee31d34b331e7155a164e90a03513e41426c8003348e0a086734e8604473235acb512c0920cda63bef37be5c1cc346ec360692abbf589b3b812fbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-elzcards-doc"

RDEPENDS:${PN} += ""

inherit rpm
