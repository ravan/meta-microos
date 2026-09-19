SUMMARY = "Documentation for texlive-txfonts"
DESCRIPTION = "This package includes the documentation for texlive-txfonts"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-txfonts-doc-2026.226.svn77682-59.2.noarch.rpm"
RPM_HASH = "80835ece61b459842cf2ffb12081df9fa7527af9ef86d12e6cd35ce9b5358205f23682c9a8697917dad19c3f3fd27f8bbc4d8acb6bec2f660c98fcfcceee8958"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-txfonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
