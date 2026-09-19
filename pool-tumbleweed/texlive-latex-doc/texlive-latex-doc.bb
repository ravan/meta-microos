SUMMARY = "Documentation for texlive-latex"
DESCRIPTION = "This package includes the documentation for texlive-latex"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76924"

RPM_NAME = "texlive-latex-doc-2026.226.svn76924-63.2.noarch.rpm"
RPM_HASH = "a0f2084f55aff1d6aea4d5ca9644e42f0b7b526b3e6acc5ec0a3d849642ab1bea153580f583913c45a62bfe499858a531e0d6d57def67b1e48b77f5626f6b6fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-doc"

RDEPENDS:${PN} += ""

inherit rpm
