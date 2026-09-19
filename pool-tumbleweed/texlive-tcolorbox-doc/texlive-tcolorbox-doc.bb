SUMMARY = "Documentation for texlive-tcolorbox"
DESCRIPTION = "This package includes the documentation for texlive-tcolorbox"
LICENSE = "LPPL-1.0"

PV = "2026.227.6.9.0svn77682"

RPM_NAME = "texlive-tcolorbox-doc-2026.227.6.9.0svn77682-62.2.noarch.rpm"
RPM_HASH = "e941b57f2083ba44aa0291d7284c32e084293f97f112fae2a50f1575525b43cb7b98a6480f343fcfb3628f6fdf33e5cf5af28f0c34fe2d5aa9b935b7caa69e05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tcolorbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
