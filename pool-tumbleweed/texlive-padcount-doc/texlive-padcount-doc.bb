SUMMARY = "Documentation for texlive-padcount"
DESCRIPTION = "This package includes the documentation for texlive-padcount"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn47621"

RPM_NAME = "texlive-padcount-doc-2026.226.1.0svn47621-58.2.noarch.rpm"
RPM_HASH = "2d247e39b9e00642f84b9871e11ba083ee05b60cff88d2a00aef4cdb87df40df4a188cdd84850198ab5c783c232f0f9f3a0a32df6937b606ae5fd1a307402c3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-padcount-doc"

RDEPENDS:${PN} += ""

inherit rpm
