SUMMARY = "Documentation for texlive-picture"
DESCRIPTION = "This package includes the documentation for texlive-picture"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6svn77682"

RPM_NAME = "texlive-picture-doc-2026.226.1.6svn77682-58.2.noarch.rpm"
RPM_HASH = "6706e1dcae0044a9ad324536d2314718a990f2a2f1ab3e1ca5909b1861d2a077abe9d375fd3658af8a225a98d3885406de0707cba3cf9a253cd1a5675df6ee35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-picture-doc"

RDEPENDS:${PN} += ""

inherit rpm
