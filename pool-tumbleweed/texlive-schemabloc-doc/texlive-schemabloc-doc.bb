SUMMARY = "Documentation for texlive-schemabloc"
DESCRIPTION = "This package includes the documentation for texlive-schemabloc"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.9svn68445"

RPM_NAME = "texlive-schemabloc-doc-2026.226.1.9svn68445-60.2.noarch.rpm"
RPM_HASH = "faa98207d302f2910cf8f8715f30ca0b0046f757e170e0c19ba5f0b8091e35586d057bfef2e378ca987d88f6a61ebff5119c99075ef9e8c4f3feef6ceb2bf914"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-schemabloc-doc-fr \
texlive-schemabloc-doc"

RDEPENDS:${PN} += ""

inherit rpm
