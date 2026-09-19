SUMMARY = "Documentation for texlive-xecjk"
DESCRIPTION = "This package includes the documentation for texlive-xecjk"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.9.1svn77682"

RPM_NAME = "texlive-xecjk-doc-2026.226.3.9.1svn77682-59.4.noarch.rpm"
RPM_HASH = "a234ed06544915d4464a3ba4e6815d4223c33a886ba086a061a2ce73144f8ffba74cc883e7a4e180ba33a0542b1bf7c7372683d2ab69e45832b5c8f8877ec0e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xecjk-doc-zh \
texlive-xecjk-doc"

RDEPENDS:${PN} += ""

inherit rpm
