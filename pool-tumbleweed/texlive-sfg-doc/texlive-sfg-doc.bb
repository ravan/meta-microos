SUMMARY = "Documentation for texlive-sfg"
DESCRIPTION = "This package includes the documentation for texlive-sfg"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.91svn20209"

RPM_NAME = "texlive-sfg-doc-2026.226.0.0.91svn20209-60.2.noarch.rpm"
RPM_HASH = "b13f7a4d44ef2b8c0870464aa1d080dd068f081b5e003f1c8ef73eb4e7b6a2942932d95ce39334e2ea72d1c955ea1f5f1af5159ad3872e31c4e71705bf24f609"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sfg-doc"

RDEPENDS:${PN} += ""

inherit rpm
