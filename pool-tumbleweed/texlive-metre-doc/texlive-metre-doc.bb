SUMMARY = "Documentation for texlive-metre"
DESCRIPTION = "This package includes the documentation for texlive-metre"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn18489"

RPM_NAME = "texlive-metre-doc-2026.226.1.0svn18489-61.2.noarch.rpm"
RPM_HASH = "74437ef6edba3c7dcd2f57a246ba085b03d008478faeff66545048770b01f39772d134218e4eeff33621c5a35b3116135cdba98e864ac02147b659ef74b95c5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-metre-doc"

RDEPENDS:${PN} += ""

inherit rpm
