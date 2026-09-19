SUMMARY = "Documentation for texlive-draftfigure"
DESCRIPTION = "This package includes the documentation for texlive-draftfigure"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn76790"

RPM_NAME = "texlive-draftfigure-doc-2026.226.0.0.2svn76790-59.2.noarch.rpm"
RPM_HASH = "a6062835d958afdb91fc2e9be56ae3b0b82ac8ff1b4819f569e1680399ab8b1439dddfedd50960243d06be0a4531d7c4babb963af2d2931bf50c34cc5d7ac08e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-draftfigure-doc"

RDEPENDS:${PN} += ""

inherit rpm
