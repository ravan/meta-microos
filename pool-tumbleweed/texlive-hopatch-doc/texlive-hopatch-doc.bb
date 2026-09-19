SUMMARY = "Documentation for texlive-hopatch"
DESCRIPTION = "This package includes the documentation for texlive-hopatch"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn65491"

RPM_NAME = "texlive-hopatch-doc-2026.226.1.5svn65491-60.4.noarch.rpm"
RPM_HASH = "9a02697a217facb19e9687e47077cb312c5be42266d7b54a1ed89666265830ce3539d72951d8944664afb3301c835925829e96790b27f7bbdd4708fbaf345794"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hopatch-doc"

RDEPENDS:${PN} += ""

inherit rpm
