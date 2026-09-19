SUMMARY = "Documentation for texlive-spreadtab"
DESCRIPTION = "This package includes the documentation for texlive-spreadtab"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.61svn77682"

RPM_NAME = "texlive-spreadtab-doc-2026.226.0.0.61svn77682-64.2.noarch.rpm"
RPM_HASH = "584264a12ea79460604b47aace3acb9dfdf7e8389b3328de82e49649e1c8940ae00967f9c68b0201978c4247b5d007917fc47eda1650be422869e7135015be6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-spreadtab-doc-en;fr \
texlive-spreadtab-doc"

RDEPENDS:${PN} += ""

inherit rpm
