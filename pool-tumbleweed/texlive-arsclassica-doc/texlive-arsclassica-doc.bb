SUMMARY = "Documentation for texlive-arsclassica"
DESCRIPTION = "This package includes the documentation for texlive-arsclassica"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn45656"

RPM_NAME = "texlive-arsclassica-doc-2026.226.svn45656-60.2.noarch.rpm"
RPM_HASH = "a685c778c264b9da36a81a7c5be7014470f42c53d4bde7852f0f0941cb74047928a1a1e331cdc501711ff681aae6c198f58ec0e6fa7d578417b84f663e6ded43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-arsclassica-doc-en \
texlive-arsclassica-doc"

RDEPENDS:${PN} += ""

inherit rpm
