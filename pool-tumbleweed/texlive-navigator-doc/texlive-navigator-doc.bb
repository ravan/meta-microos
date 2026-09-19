SUMMARY = "Documentation for texlive-navigator"
DESCRIPTION = "This package includes the documentation for texlive-navigator"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn41413"

RPM_NAME = "texlive-navigator-doc-2026.226.1.1svn41413-61.2.noarch.rpm"
RPM_HASH = "7b505ed657f8779da5dcb5e9ddcb3eaa6a679ac6e92ba59a72041ec69209b86d293680622b5138ef2648dd5db9fcbb54aa1c97c09c273e1d15cbf13ebe448343"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-navigator-doc"

RDEPENDS:${PN} += ""

inherit rpm
