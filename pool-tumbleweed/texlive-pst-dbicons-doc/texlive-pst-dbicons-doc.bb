SUMMARY = "Documentation for texlive-pst-dbicons"
DESCRIPTION = "This package includes the documentation for texlive-pst-dbicons"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.16svn17556"

RPM_NAME = "texlive-pst-dbicons-doc-2026.226.0.0.16svn17556-59.2.noarch.rpm"
RPM_HASH = "69efd981b714bd14e10ace9516c128331101ce8344f755257e98a4cca04b9bfb84eb6055f96efbcfaca2a78d52702861bc317576d8c2b3c47140caeed10964b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-dbicons-doc"

RDEPENDS:${PN} += ""

inherit rpm
