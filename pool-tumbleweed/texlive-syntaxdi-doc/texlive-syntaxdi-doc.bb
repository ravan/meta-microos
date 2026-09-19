SUMMARY = "Documentation for texlive-syntaxdi"
DESCRIPTION = "This package includes the documentation for texlive-syntaxdi"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.8.2svn56685"

RPM_NAME = "texlive-syntaxdi-doc-2026.226.0.0.8.2svn56685-64.2.noarch.rpm"
RPM_HASH = "b878d6d2e1828ca80212fc5e4faeddb40a0c48253ab1da0f8e0951def65bdf6666072bcd6979e201c63e8d03d16bd72be3efd27507d94571159d6c68cb11341e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-syntaxdi-doc"

RDEPENDS:${PN} += ""

inherit rpm
