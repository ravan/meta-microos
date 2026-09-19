SUMMARY = "Documentation for texlive-pst-thick"
DESCRIPTION = "This package includes the documentation for texlive-pst-thick"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn16369"

RPM_NAME = "texlive-pst-thick-doc-2026.226.1.0svn16369-60.4.noarch.rpm"
RPM_HASH = "0c74e02bc5c7ebc22d6a319cf5074415588ff7a7e2eec687ade8e6d51ee8f577d7cf25d91780a2bfeca702fb426523ad419d9e087f18f3514800ea64e15a7b68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-thick-doc-fr \
texlive-pst-thick-doc"

RDEPENDS:${PN} += ""

inherit rpm
