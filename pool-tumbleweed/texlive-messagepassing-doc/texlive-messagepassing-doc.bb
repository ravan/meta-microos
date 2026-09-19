SUMMARY = "Documentation for texlive-messagepassing"
DESCRIPTION = "This package includes the documentation for texlive-messagepassing"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn69123"

RPM_NAME = "texlive-messagepassing-doc-2026.226.1.2svn69123-61.2.noarch.rpm"
RPM_HASH = "02fd930f1be747664f71e5bbb472f358538fb090bed7c6555fb6ce81a1e1164ae6f16769d7ddfbcdd04f9e6ce88a864f6ad40e74bd99d1fb1ae42fe3fd9ed71c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-messagepassing-doc"

RDEPENDS:${PN} += ""

inherit rpm
