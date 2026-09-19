SUMMARY = "Documentation for texlive-grid"
DESCRIPTION = "This package includes the documentation for texlive-grid"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn61719"

RPM_NAME = "texlive-grid-doc-2026.226.1.0svn61719-60.4.noarch.rpm"
RPM_HASH = "399ccdc1e9345c846ed3660695bb85f498220370625916851a873b7013d1fcf952265d45b91b8b885204d34290199ebf747e92ff6e89092aae1f667f65ef0eeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-grid-doc"

RDEPENDS:${PN} += ""

inherit rpm
