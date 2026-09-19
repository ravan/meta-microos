SUMMARY = "Documentation for texlive-armtex"
DESCRIPTION = "This package includes the documentation for texlive-armtex"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.0_beta5svn69418"

RPM_NAME = "texlive-armtex-doc-2026.226.3.0_beta5svn69418-61.2.noarch.rpm"
RPM_HASH = "7348bff15f10566d44a9af072f5d28edca14228309f769830a2dde7a48005e50464f45504e1558f7212f51ceb84089e7b5f390e45c2519d5000ea5e4f41e3fb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-armtex-doc-en;hy \
texlive-armtex-doc"

RDEPENDS:${PN} += ""

inherit rpm
