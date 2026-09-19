SUMMARY = "Documentation for texlive-venturisadf"
DESCRIPTION = "This package includes the documentation for texlive-venturisadf"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn77682"

RPM_NAME = "texlive-venturisadf-doc-2026.226.2.0svn77682-60.2.noarch.rpm"
RPM_HASH = "e36d9f28c604ca663017a650d88f8c9e5bd627497d0dff68416e0348b7e280e6821191090fb2cc47ea83de72495826172a6f93af971ba12a55bde10b778d8b7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-venturisadf-doc"

RDEPENDS:${PN} += ""

inherit rpm
