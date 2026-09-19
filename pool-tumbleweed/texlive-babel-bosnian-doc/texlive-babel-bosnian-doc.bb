SUMMARY = "Documentation for texlive-babel-bosnian"
DESCRIPTION = "This package includes the documentation for texlive-babel-bosnian"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn77682"

RPM_NAME = "texlive-babel-bosnian-doc-2026.226.1.1svn77682-60.2.noarch.rpm"
RPM_HASH = "740e692d12afde088db59b239c5a84c02509cad0035459d908777b0e0827f9f6173a9ecb8bd3568b539eb949b9b8ca482862e2e9470b0bcf7b21ffb4edda16dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-bosnian-doc"

RDEPENDS:${PN} += ""

inherit rpm
