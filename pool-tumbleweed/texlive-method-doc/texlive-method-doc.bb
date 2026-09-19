SUMMARY = "Documentation for texlive-method"
DESCRIPTION = "This package includes the documentation for texlive-method"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0bsvn17485"

RPM_NAME = "texlive-method-doc-2026.226.2.0bsvn17485-61.2.noarch.rpm"
RPM_HASH = "0cee5829361d5371b8e5ed9c33ffa59d223f68d449cb58a472a245abad110e63eaaf1f8f3d0cb415b6eae9fcbc00c03fca10f62349a229399cf2fd1e1ca70452"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-method-doc"

RDEPENDS:${PN} += ""

inherit rpm
