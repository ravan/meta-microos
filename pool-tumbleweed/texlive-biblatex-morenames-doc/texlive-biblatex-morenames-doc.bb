SUMMARY = "Documentation for texlive-biblatex-morenames"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-morenames"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3.1svn43049"

RPM_NAME = "texlive-biblatex-morenames-doc-2026.226.1.3.1svn43049-61.2.noarch.rpm"
RPM_HASH = "6cdd707a4b4e548aaf2541b4228c27ba2bd8790d07e96e13bbddb6c5fafee37051bd0f6757b7b059a49228392793733950011f95609a12531dd45cebfd8bac8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-morenames-doc"

RDEPENDS:${PN} += ""

inherit rpm
