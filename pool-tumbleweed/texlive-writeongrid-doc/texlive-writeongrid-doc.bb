SUMMARY = "Documentation for texlive-writeongrid"
DESCRIPTION = "This package includes the documentation for texlive-writeongrid"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.9svn77353"

RPM_NAME = "texlive-writeongrid-doc-2026.226.0.0.1.9svn77353-59.4.noarch.rpm"
RPM_HASH = "640d819bd0d805de9ada1827b89b1d8fde1a5e87ec4aa5b51f8f7a18baa03576411e42db1d5faf8478047e626f249314461adfac44bc6da171699bbc8621af35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-writeongrid-doc-fr \
texlive-writeongrid-doc"

RDEPENDS:${PN} += ""

inherit rpm
