SUMMARY = "Documentation for texlive-systeme"
DESCRIPTION = "This package includes the documentation for texlive-systeme"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.51svn77682"

RPM_NAME = "texlive-systeme-doc-2026.226.0.0.51svn77682-64.2.noarch.rpm"
RPM_HASH = "fcd2f32e2b2ab95d3523fce162251c832229677945f6e0a8115c059deb8272e50b0b25d4ffc838a1c2e6a0cc36d1a6d177965575633e578798081c45d9b61ba1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-systeme-doc-fr \
texlive-systeme-doc"

RDEPENDS:${PN} += ""

inherit rpm
