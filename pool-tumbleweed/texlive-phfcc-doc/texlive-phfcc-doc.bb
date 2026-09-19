SUMMARY = "Documentation for texlive-phfcc"
DESCRIPTION = "This package includes the documentation for texlive-phfcc"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn60731"

RPM_NAME = "texlive-phfcc-doc-2026.226.2.0svn60731-58.2.noarch.rpm"
RPM_HASH = "216f6b0e223362facf1177b5de89db874de7e810f28292c46562ddc6819f1e190ed12ab277a2ad4ac9e81ff95a1d787eb93c414a064c7b7889987406779fe498"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-phfcc-doc"

RDEPENDS:${PN} += ""

inherit rpm
