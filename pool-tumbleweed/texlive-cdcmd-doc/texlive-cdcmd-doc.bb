SUMMARY = "Documentation for texlive-cdcmd"
DESCRIPTION = "This package includes the documentation for texlive-cdcmd"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn76924"

RPM_NAME = "texlive-cdcmd-doc-2026.226.1.0svn76924-59.2.noarch.rpm"
RPM_HASH = "e3d540a59d74753b12e585ddd98678f9bc0aef6c7d68dcc867c9538c9ad7974ced64275fe7f347f23007b7ad69ac52dfeb93052f021c64697f44b566ece7e0a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-cdcmd-doc-zh \
texlive-cdcmd-doc"

RDEPENDS:${PN} += ""

inherit rpm
