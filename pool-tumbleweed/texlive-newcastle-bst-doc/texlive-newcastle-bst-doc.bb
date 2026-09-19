SUMMARY = "Documentation for texlive-newcastle-bst"
DESCRIPTION = "This package includes the documentation for texlive-newcastle-bst"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn76790"

RPM_NAME = "texlive-newcastle-bst-doc-2026.226.1.1svn76790-61.2.noarch.rpm"
RPM_HASH = "4c45ed1e1886f5a5498584cec8ce9a1923fd9d3f460bc13d08681f2bdf8944cb15db7bb9ee54edc9b10f99d5453b84a2487ae60bbd4b98a4ca0d90611f914824"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-newcastle-bst-doc"

RDEPENDS:${PN} += ""

inherit rpm
