SUMMARY = "Documentation for texlive-jsonparse"
DESCRIPTION = "This package includes the documentation for texlive-jsonparse"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.7.1svn77682"

RPM_NAME = "texlive-jsonparse-doc-2026.226.1.7.1svn77682-63.2.noarch.rpm"
RPM_HASH = "9d7161f37fcaa04cbea44a2a3113ce0de10f7b0eb8bbcbf8c232a95aadd6335a0f900cb2fd4872668f56caa626713fc859d88e8110ad0d368e87020b15b73efd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jsonparse-doc"

RDEPENDS:${PN} += ""

inherit rpm
