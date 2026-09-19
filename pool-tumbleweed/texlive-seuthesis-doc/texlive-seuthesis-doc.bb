SUMMARY = "Documentation for texlive-seuthesis"
DESCRIPTION = "This package includes the documentation for texlive-seuthesis"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.1.2svn33042"

RPM_NAME = "texlive-seuthesis-doc-2026.226.2.1.2svn33042-60.2.noarch.rpm"
RPM_HASH = "bc74e843b5919bbf1935b348fde0bbfc7bf19add5807e994e05cef5cfdfa9148ce4f2919fa8640925ad64bb74501a4555cbb23f57c979f3eb4a64e917f83da3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-seuthesis-doc-zh \
texlive-seuthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
