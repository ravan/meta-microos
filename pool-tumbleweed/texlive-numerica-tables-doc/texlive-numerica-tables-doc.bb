SUMMARY = "Documentation for texlive-numerica-tables"
DESCRIPTION = "This package includes the documentation for texlive-numerica-tables"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.2.0svn77682"

RPM_NAME = "texlive-numerica-tables-doc-2026.226.3.2.0svn77682-61.2.noarch.rpm"
RPM_HASH = "6c97a5ee78d2855387cd0a9cd8914fc019853bd9069bf6464796a3096b326888aa91e4ff46db02f9a743d408dca22536a7b69330e164e3f1a3ee797f1f4f0505"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-numerica-tables-doc"

RDEPENDS:${PN} += ""

inherit rpm
