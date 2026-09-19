SUMMARY = "Documentation for texlive-inconsolata-nerd-font"
DESCRIPTION = "This package includes the documentation for texlive-inconsolata-nerd-font"
LICENSE = "OFL-1.1"

PV = "2026.226.0.0.5svn77682"

RPM_NAME = "texlive-inconsolata-nerd-font-doc-2026.226.0.0.5svn77682-60.2.noarch.rpm"
RPM_HASH = "fd2006603a7a004056e049da430c1421e1df57ac4c570cff2fcfb60520d56b6ea4e7465f4fcd509801863d23360d3cbcca53b0f8db445479f7848b4d3d7e8931"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-inconsolata-nerd-font-doc"

RDEPENDS:${PN} += ""

inherit rpm
