SUMMARY = "Documentation for texlive-fiziko"
DESCRIPTION = "This package includes the documentation for texlive-fiziko"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.2.0svn61944"

RPM_NAME = "texlive-fiziko-doc-2026.226.0.0.2.0svn61944-59.2.noarch.rpm"
RPM_HASH = "6531f795a3c55eef4e55ecfda35fdb71c8d5d494c7f5908be9feb25e682cb8de1993318756c4e50bf0ef66d3e53700a60ab804e8d19fd6b65333493a34612b88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fiziko-doc"

RDEPENDS:${PN} += ""

inherit rpm
