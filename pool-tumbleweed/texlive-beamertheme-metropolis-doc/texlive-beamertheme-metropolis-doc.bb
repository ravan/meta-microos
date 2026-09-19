SUMMARY = "Documentation for texlive-beamertheme-metropolis"
DESCRIPTION = "This package includes the documentation for texlive-beamertheme-metropolis"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn43031"

RPM_NAME = "texlive-beamertheme-metropolis-doc-2026.226.1.2svn43031-61.2.noarch.rpm"
RPM_HASH = "bdf3393c7b0de4b43cd8210eb63e4c83c20ca934e2a3a1292d42519c485d2a3087f6443d671331e8022a750ab0725ce30b2739847c01c54b258d2fa0b93395fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamertheme-metropolis-doc"

RDEPENDS:${PN} += ""

inherit rpm
