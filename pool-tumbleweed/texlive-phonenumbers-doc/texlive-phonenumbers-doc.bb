SUMMARY = "Documentation for texlive-phonenumbers"
DESCRIPTION = "This package includes the documentation for texlive-phonenumbers"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.6svn77682"

RPM_NAME = "texlive-phonenumbers-doc-2026.226.2.6svn77682-58.2.noarch.rpm"
RPM_HASH = "65f085c7483049a9e614fca36453e8fa75af40345ff3ab4b5dfa6d96b4e3d02f718d1354cabfc4816dfc0686aaa086227a6cdc5b5edabc3af414efcee820c73f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-phonenumbers-doc-de \
texlive-phonenumbers-doc"

RDEPENDS:${PN} += ""

inherit rpm
