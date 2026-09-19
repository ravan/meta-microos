SUMMARY = "Documentation for texlive-phfqit"
DESCRIPTION = "This package includes the documentation for texlive-phfqit"
LICENSE = "LPPL-1.0"

PV = "2026.226.4.1svn60734"

RPM_NAME = "texlive-phfqit-doc-2026.226.4.1svn60734-58.2.noarch.rpm"
RPM_HASH = "25f6f51ac758f1b85ee426cf38e31bc31e7beb386e491712f72904634199a54d69ca6b9f6292e6640eb95e5d2b30be83cebebf2f6feaae7c4a553d2922b9c2eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-phfqit-doc"

RDEPENDS:${PN} += ""

inherit rpm
