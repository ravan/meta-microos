SUMMARY = "Documentation for texlive-beamer-verona"
DESCRIPTION = "This package includes the documentation for texlive-beamer-verona"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn39180"

RPM_NAME = "texlive-beamer-verona-doc-2026.226.0.0.2svn39180-61.2.noarch.rpm"
RPM_HASH = "a3612270bcdd60f2e321b7bb7d5347ca507cc47e1610b591c1448644b6ad5bd9dc5e7f0be0563860aaa3350c9f387e883f9488bd74323927cad77351b2d9888d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamer-verona-doc"

RDEPENDS:${PN} += ""

inherit rpm
