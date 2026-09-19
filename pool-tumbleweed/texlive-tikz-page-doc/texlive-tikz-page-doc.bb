SUMMARY = "Documentation for texlive-tikz-page"
DESCRIPTION = "This package includes the documentation for texlive-tikz-page"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn42039"

RPM_NAME = "texlive-tikz-page-doc-2026.226.1.0svn42039-59.2.noarch.rpm"
RPM_HASH = "ea4926add2b20c729ae5995f7a9138433f74655f4cff4e785d9519386aeb18af45accefdea0cb3c66693add79f5e242ff357a729872d3123d13da019a6efdb09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-page-doc"

RDEPENDS:${PN} += ""

inherit rpm
