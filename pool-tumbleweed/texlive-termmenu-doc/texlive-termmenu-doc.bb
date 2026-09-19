SUMMARY = "Documentation for texlive-termmenu"
DESCRIPTION = "This package includes the documentation for texlive-termmenu"
LICENSE = "LPPL-1.0"

PV = "2026.227.svn76924"

RPM_NAME = "texlive-termmenu-doc-2026.227.svn76924-62.2.noarch.rpm"
RPM_HASH = "538d077399815f68c24f6555a7c24a84625d33babb348a173c0954924c66d97f2b198ff4c0d5d1190879d1f14a194f3cde4706443c56be5bdf2458599ac872ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-termmenu-doc"

RDEPENDS:${PN} += ""

inherit rpm
