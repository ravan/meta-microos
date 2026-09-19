SUMMARY = "Documentation for texlive-keisennote"
DESCRIPTION = "This package includes the documentation for texlive-keisennote"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.0svn77255"

RPM_NAME = "texlive-keisennote-doc-2026.226.1.2.0svn77255-63.2.noarch.rpm"
RPM_HASH = "48a6149f3cf54ef1a6e8d458f9d64ff4148936d94ce398248dac46d114f927d46483a7ab25d5c8fd037fa521641931090e4fc4e13801c4c2a0458d4f4b5842b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-keisennote-doc"

RDEPENDS:${PN} += ""

inherit rpm
