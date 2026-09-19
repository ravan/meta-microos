SUMMARY = "Documentation for texlive-pxchfon"
DESCRIPTION = "This package includes the documentation for texlive-pxchfon"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2svn77682"

RPM_NAME = "texlive-pxchfon-doc-2026.226.2.2svn77682-60.4.noarch.rpm"
RPM_HASH = "e83225e3cf1d369f52ad0b59edb872b3da16d315fcf13218ddf5ff0a400bd6a112a04fa41bb834dd8de2862619d2e503e122a382228e85622f1c1a396294c079"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pxchfon-doc-ja \
texlive-pxchfon-doc"

RDEPENDS:${PN} += ""

inherit rpm
