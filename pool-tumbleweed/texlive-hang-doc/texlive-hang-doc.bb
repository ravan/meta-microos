SUMMARY = "Documentation for texlive-hang"
DESCRIPTION = "This package includes the documentation for texlive-hang"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn43280"

RPM_NAME = "texlive-hang-doc-2026.226.2.1svn43280-60.4.noarch.rpm"
RPM_HASH = "08cdb3091e77d2fef8e96b904d99429081da183f3d3c3e2d1863e0b967f5f72283dbb0628ec9d08f38a4684ccb0c60c47be540c53ee406769baa2050687a8f13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hang-doc"

RDEPENDS:${PN} += ""

inherit rpm
