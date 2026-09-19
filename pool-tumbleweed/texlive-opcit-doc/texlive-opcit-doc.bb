SUMMARY = "Documentation for texlive-opcit"
DESCRIPTION = "This package includes the documentation for texlive-opcit"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn15878"

RPM_NAME = "texlive-opcit-doc-2026.226.1.1svn15878-61.2.noarch.rpm"
RPM_HASH = "5f531dd56187d6a39677c4d60f643d19325783ad73b10c6d01b65e747c7a0bcad0b27c5a0ee90a24d6610ec3f5f1a01748fe23842b18c268df6a1b07a866478a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-opcit-doc"

RDEPENDS:${PN} += ""

inherit rpm
