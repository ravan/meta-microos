SUMMARY = "Documentation for texlive-competences"
DESCRIPTION = "This package includes the documentation for texlive-competences"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn47573"

RPM_NAME = "texlive-competences-doc-2026.226.1.0svn47573-60.2.noarch.rpm"
RPM_HASH = "5806c9c6e852c4b1bb34f9bd53b36ef4e0931f662dd1f9b7938dc98338c53a62af30bcc293d49500f4579501fc88c93228a59aefee9b6e358a1721e5aaebc6d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-competences-doc"

RDEPENDS:${PN} += ""

inherit rpm
