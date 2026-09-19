SUMMARY = "Documentation for texlive-chess"
DESCRIPTION = "This package includes the documentation for texlive-chess"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.2svn78101"

RPM_NAME = "texlive-chess-doc-2026.226.1.2svn78101-60.2.noarch.rpm"
RPM_HASH = "657fe69b1f3ea266cd5cc5a1d407523123064ce42d0310f1ab393ad8617ea8256dedac13cae4451ed29b5de584dd3dda603bb9452cfd49ab5901d286a1ae99c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chess-doc"

RDEPENDS:${PN} += ""

inherit rpm
