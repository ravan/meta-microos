SUMMARY = "Documentation for texlive-eqlist"
DESCRIPTION = "This package includes the documentation for texlive-eqlist"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn77682"

RPM_NAME = "texlive-eqlist-doc-2026.226.2.1svn77682-61.4.noarch.rpm"
RPM_HASH = "374c498e6a6207f3d1049bad036ac7314fe5c9c7bf4bdd896e94e74dcba16a25791c15ac38e665e8460c6b2048d0809ca76d221ae215a72086efb66843b7cb16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eqlist-doc"

RDEPENDS:${PN} += ""

inherit rpm
