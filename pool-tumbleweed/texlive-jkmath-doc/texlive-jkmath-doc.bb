SUMMARY = "Documentation for texlive-jkmath"
DESCRIPTION = "This package includes the documentation for texlive-jkmath"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn47109"

RPM_NAME = "texlive-jkmath-doc-2026.226.0.0.1svn47109-63.2.noarch.rpm"
RPM_HASH = "9d62917b05b03a51059b30d23d6bff2385af43b5777483ed4c5fae30c220cf638a36a36096570da4e42e38cf74baef3353959a52937a1deeea8f18c477149814"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jkmath-doc"

RDEPENDS:${PN} += ""

inherit rpm
