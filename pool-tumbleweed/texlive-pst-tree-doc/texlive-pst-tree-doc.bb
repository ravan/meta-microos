SUMMARY = "Documentation for texlive-pst-tree"
DESCRIPTION = "This package includes the documentation for texlive-pst-tree"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.14svn77682"

RPM_NAME = "texlive-pst-tree-doc-2026.226.1.14svn77682-60.4.noarch.rpm"
RPM_HASH = "3e3e86f6d5fc8e4de74c29af9bb639745b426075b944e1b87a861402b956b0f929c33dddd84dc39c4d14f3f456517dd2f32a59b07bed8799642a2c7bd41e6077"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-tree-doc-en \
texlive-pst-tree-doc"

RDEPENDS:${PN} += ""

inherit rpm
