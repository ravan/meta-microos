SUMMARY = "Documentation for texlive-bookshelf"
DESCRIPTION = "This package includes the documentation for texlive-bookshelf"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn72521"

RPM_NAME = "texlive-bookshelf-doc-2026.226.1.2svn72521-59.2.noarch.rpm"
RPM_HASH = "6d1402b62626c606c81048e8a7a43f2527491aa29347fad3a297d662153d5038e04b42f8f76ce06fc5437f8686076ffffa47e41d6e02566ae709f0d23e653e41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-bookshelf-listallfonts.1 \
man-bookshelf-mkfontsel.1 \
texlive-bookshelf-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
