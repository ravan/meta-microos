SUMMARY = "Documentation for texlive-gates"
DESCRIPTION = "This package includes the documentation for texlive-gates"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn29803"

RPM_NAME = "texlive-gates-doc-2026.226.0.0.2svn29803-60.2.noarch.rpm"
RPM_HASH = "5853612237e46d68efd079030c9553a09ede69ed43b99449e4f89ff1382d8a416796e7c2d547589ec8d540d5c5ac3063b9770efc8cc52aa79090546d12472713"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gates-doc"

RDEPENDS:${PN} += ""

inherit rpm
