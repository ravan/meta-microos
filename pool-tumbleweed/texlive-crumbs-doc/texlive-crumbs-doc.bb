SUMMARY = "Documentation for texlive-crumbs"
DESCRIPTION = "This package includes the documentation for texlive-crumbs"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4.1svn64602"

RPM_NAME = "texlive-crumbs-doc-2026.226.0.0.4.1svn64602-61.2.noarch.rpm"
RPM_HASH = "3e85c64c57dc35b145fc18625e6a27e7228170babdc7f654dabbc9cca261a03aaaabb57cd2e785079f6de2de20826a0aa83fddcf439f58a75f8abfab631fc5de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-crumbs-doc"

RDEPENDS:${PN} += ""

inherit rpm
