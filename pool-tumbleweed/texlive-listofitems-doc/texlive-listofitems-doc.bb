SUMMARY = "Documentation for texlive-listofitems"
DESCRIPTION = "This package includes the documentation for texlive-listofitems"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.65svn77682"

RPM_NAME = "texlive-listofitems-doc-2026.226.1.65svn77682-61.2.noarch.rpm"
RPM_HASH = "6e0960f9ad2034d7e1ef07c1edb836ff5ea24d16740bb1af409e801791965990ffc17ae484823b9104e4d345e3ce50b933686cfc6adab2db7541fbd7c046df16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-listofitems-doc-en;fr \
texlive-listofitems-doc"

RDEPENDS:${PN} += ""

inherit rpm
