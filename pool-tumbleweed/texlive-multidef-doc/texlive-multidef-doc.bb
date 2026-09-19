SUMMARY = "Documentation for texlive-multidef"
DESCRIPTION = "This package includes the documentation for texlive-multidef"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.10svn40637"

RPM_NAME = "texlive-multidef-doc-2026.226.1.10svn40637-61.2.noarch.rpm"
RPM_HASH = "c33a6e6c9a9d75cde373c15fd1b56ac23bc2cd80dc5674d0bfdb2d96d4028263de64b4f322a8379dda89fe27cf3e61d02e4e5d638d01a1639818adbe75def4ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-multidef-doc"

RDEPENDS:${PN} += ""

inherit rpm
