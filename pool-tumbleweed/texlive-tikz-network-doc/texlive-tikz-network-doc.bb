SUMMARY = "Documentation for texlive-tikz-network"
DESCRIPTION = "This package includes the documentation for texlive-tikz-network"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.1svn51884"

RPM_NAME = "texlive-tikz-network-doc-2026.226.1.1svn51884-59.2.noarch.rpm"
RPM_HASH = "5c018ec54e5d02388786a9af69b3dff3f0982b1a82c7e92b8208a75153f7403dd6c2cbc63203858d8554e66eaed2e49b15018039ce3a5fd47c72f026f4b58248"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-network-doc"

RDEPENDS:${PN} += ""

inherit rpm
