SUMMARY = "Documentation for texlive-semtex"
DESCRIPTION = "This package includes the documentation for texlive-semtex"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.45svn76924"

RPM_NAME = "texlive-semtex-doc-2026.226.0.0.45svn76924-60.2.noarch.rpm"
RPM_HASH = "0bc3c1e2bef348b2333f7a971c2cd223d83ebd6c1c7acf1bcfa24c88b4d48a43c7bbf0541d7a9bd9874d47df0db6a501955aa7a002f49d865828180bc6c1e44e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-semtex-doc"

RDEPENDS:${PN} += ""

inherit rpm
