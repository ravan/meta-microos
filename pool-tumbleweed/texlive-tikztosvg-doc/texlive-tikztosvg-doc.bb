SUMMARY = "Documentation for texlive-tikztosvg"
DESCRIPTION = "This package includes the documentation for texlive-tikztosvg"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.3.0svn60289"

RPM_NAME = "texlive-tikztosvg-doc-2026.226.0.0.3.0svn60289-59.2.noarch.rpm"
RPM_HASH = "0d87c5d01d7ed04bcd6a69bb45231c2ac9f800ca05ddf2eb76e0642a7766eff96562f8d0a6f8060092588b91929c2f6559e3a6dcdbbdb9da24fb4bf6b67e569d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-tikztosvg.1 \
texlive-tikztosvg-doc"

RDEPENDS:${PN} += ""

inherit rpm
