SUMMARY = "Documentation for texlive-beamercolorthemeowl"
DESCRIPTION = "This package includes the documentation for texlive-beamercolorthemeowl"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.1svn40105"

RPM_NAME = "texlive-beamercolorthemeowl-doc-2026.226.0.0.1.1svn40105-61.2.noarch.rpm"
RPM_HASH = "8842fa1c15285983ed2eaa705910767a18c04b318e2859cf332f385a4e60dd93a4cc1ccb6f2cf3abbf77fbc9188bed073d860cbc1a84f004fe4f2c0c97bb7da3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamercolorthemeowl-doc"

RDEPENDS:${PN} += ""

inherit rpm
