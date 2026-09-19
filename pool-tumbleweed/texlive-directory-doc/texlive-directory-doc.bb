SUMMARY = "Documentation for texlive-directory"
DESCRIPTION = "This package includes the documentation for texlive-directory"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.20svn15878"

RPM_NAME = "texlive-directory-doc-2026.226.1.20svn15878-59.2.noarch.rpm"
RPM_HASH = "dd1f898cb05e7ff66528a673c2b3ab1d03d3675804ff418d0693e14c899fba41b25cbbb689a595af7434a322cae6e769dbbc70b1eadba0ea1bd936af2c85dd64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-directory-doc"

RDEPENDS:${PN} += ""

inherit rpm
