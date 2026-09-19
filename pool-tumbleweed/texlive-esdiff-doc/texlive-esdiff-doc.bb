SUMMARY = "Documentation for texlive-esdiff"
DESCRIPTION = "This package includes the documentation for texlive-esdiff"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn21385"

RPM_NAME = "texlive-esdiff-doc-2026.226.1.2svn21385-61.4.noarch.rpm"
RPM_HASH = "769e003bfa5f418d0e38a4d9cae47c013c7bfddc1c3ca1744d743aed3e3c335f59879f0ec97087ce029d22ba9c8dbdae30062d6afccc162d2da8cc0e396565c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-esdiff-doc"

RDEPENDS:${PN} += ""

inherit rpm
