SUMMARY = "Documentation for texlive-pbsheet"
DESCRIPTION = "This package includes the documentation for texlive-pbsheet"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn24830"

RPM_NAME = "texlive-pbsheet-doc-2026.226.0.0.1svn24830-58.2.noarch.rpm"
RPM_HASH = "a5a8fd9d869272a8e9098705014db68e5b061c4ae2cbd08cf36abe343b5d4b5230943926712a5457ba2aa03b973860bd9ccf57a8e45589e8ceada95c5dbd4e63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pbsheet-doc-fr \
texlive-pbsheet-doc"

RDEPENDS:${PN} += ""

inherit rpm
