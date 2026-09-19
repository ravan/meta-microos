SUMMARY = "Documentation for texlive-flashcards"
DESCRIPTION = "This package includes the documentation for texlive-flashcards"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.0.2svn62104"

RPM_NAME = "texlive-flashcards-doc-2026.226.1.0.2svn62104-59.2.noarch.rpm"
RPM_HASH = "f07e737cc37bc0d824468e741b4810418d8b6d49264e25a69398ceb54ef754797501c59f085c19f3c32ce080266bc1709dcfd62eb17f6a0a4fb6a21833e9b67d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-flashcards-doc"

RDEPENDS:${PN} += ""

inherit rpm
