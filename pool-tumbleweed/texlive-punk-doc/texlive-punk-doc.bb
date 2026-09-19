SUMMARY = "Documentation for texlive-punk"
DESCRIPTION = "This package includes the documentation for texlive-punk"
LICENSE = "SUSE-TeX"

PV = "2026.226.svn27388"

RPM_NAME = "texlive-punk-doc-2026.226.svn27388-60.4.noarch.rpm"
RPM_HASH = "eb8ffe7ca2fc907ccd0ac0feeb16f2d1e547c1357dea0446a67a89f7d8029ecb2ab80e414ed883fdf7752dd270ffcc070b126367d83d04be47847461747be384"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-punk-doc"

RDEPENDS:${PN} += ""

inherit rpm
