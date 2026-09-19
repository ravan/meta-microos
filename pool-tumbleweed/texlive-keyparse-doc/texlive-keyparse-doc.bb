SUMMARY = "Documentation for texlive-keyparse"
DESCRIPTION = "This package includes the documentation for texlive-keyparse"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn76924"

RPM_NAME = "texlive-keyparse-doc-2026.226.1.1svn76924-63.2.noarch.rpm"
RPM_HASH = "6f9a2cf6c594123038e31bd6d04bf67d51faa0495482263467b9bd996c07828a80d71f78776c0e7b47006a161364d27d4e17d4f2543e776f6f2d1b29152da0f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-keyparse-doc"

RDEPENDS:${PN} += ""

inherit rpm
