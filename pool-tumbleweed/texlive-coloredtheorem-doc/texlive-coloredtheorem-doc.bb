SUMMARY = "Documentation for texlive-coloredtheorem"
DESCRIPTION = "This package includes the documentation for texlive-coloredtheorem"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.2svn74812"

RPM_NAME = "texlive-coloredtheorem-doc-2026.226.1.1.2svn74812-60.2.noarch.rpm"
RPM_HASH = "371b8dffe6c562f67a1a53f48f812ae0fd0e34b5c9c8a69b3670c0be1a3365d0ea190975826c7f62b9ae5b9277bc2aa24f3930a7fd1f808702731b7ca46d63fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-coloredtheorem-doc"

RDEPENDS:${PN} += ""

inherit rpm
