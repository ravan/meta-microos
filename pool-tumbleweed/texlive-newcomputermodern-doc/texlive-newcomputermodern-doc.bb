SUMMARY = "Documentation for texlive-newcomputermodern"
DESCRIPTION = "This package includes the documentation for texlive-newcomputermodern"
LICENSE = "LPPL-1.3c"

PV = "2026.226.7.1.1svn77682"

RPM_NAME = "texlive-newcomputermodern-doc-2026.226.7.1.1svn77682-61.2.noarch.rpm"
RPM_HASH = "de1908d2a014741c15e05b29d51a73ce8f652d67d517edcdef3d3fd0898d9b73807ef0330dd53549a4ae7d63f8ce170d7ca8755b7fa717475d681e6aa1698c33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-newcomputermodern-doc"

RDEPENDS:${PN} += ""

inherit rpm
