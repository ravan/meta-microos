SUMMARY = "Documentation for texlive-bibletext"
DESCRIPTION = "This package includes the documentation for texlive-bibletext"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.2svn45196"

RPM_NAME = "texlive-bibletext-doc-2026.226.0.0.1.2svn45196-61.2.noarch.rpm"
RPM_HASH = "5fd7a9463df30f1f6dae36749ebe7f4e573521e116043f2b0bb6d2c70c3b6c5f43073254f84b88c0a4cab831c1b62984cdc4696c3164f80468fcdc7277d2b5bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bibletext-doc"

RDEPENDS:${PN} += ""

inherit rpm
