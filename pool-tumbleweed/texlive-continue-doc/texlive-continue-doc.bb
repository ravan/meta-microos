SUMMARY = "Documentation for texlive-continue"
DESCRIPTION = "This package includes the documentation for texlive-continue"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn77682"

RPM_NAME = "texlive-continue-doc-2026.226.0.0.2svn77682-61.2.noarch.rpm"
RPM_HASH = "b5059ec5e1db9748588a240a46e1c1413c1b000fa13efdf945f5563af25abacb06f3ba15185fff9e881c06941ee4afc4a5addc5f9ac1b89484e2df8fd36e50fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-continue-doc"

RDEPENDS:${PN} += ""

inherit rpm
