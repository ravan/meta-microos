SUMMARY = "Documentation for texlive-opteng"
DESCRIPTION = "This package includes the documentation for texlive-opteng"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn27331"

RPM_NAME = "texlive-opteng-doc-2026.226.1.0svn27331-61.2.noarch.rpm"
RPM_HASH = "6c9c7e7380c4caa145f10dadcc44380e3bf802b154cdccd51320bfbb3dab4a48d1017be7ab1516aeb6464a1d4176ea086c68c074809e22788b57364fe5b29cd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-opteng-doc"

RDEPENDS:${PN} += ""

inherit rpm
