SUMMARY = "Documentation for texlive-mugsthesis"
DESCRIPTION = "This package includes the documentation for texlive-mugsthesis"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn75301"

RPM_NAME = "texlive-mugsthesis-doc-2026.226.1.1svn75301-61.2.noarch.rpm"
RPM_HASH = "1e56f6204f6ab11a6fd455a8116448dbfc1e20ce03d74f90ffbd198cd5d906001962b4ebb57a0a12ea3b883f563c9e03ff8937ae8a43471fdbc772eb37c05984"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mugsthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
