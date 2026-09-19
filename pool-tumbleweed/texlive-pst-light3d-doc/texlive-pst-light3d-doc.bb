SUMMARY = "Documentation for texlive-pst-light3d"
DESCRIPTION = "This package includes the documentation for texlive-pst-light3d"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.12svn15878"

RPM_NAME = "texlive-pst-light3d-doc-2026.226.0.0.12svn15878-59.2.noarch.rpm"
RPM_HASH = "f9f7dcfdc78b2ed66fe556b7484e8c178bbc55aaec0f08637eccefabf04189447653b8abf25113fc184f39313f5d379f9d96a5fae5d9bca9f13b44cad6dc4038"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-light3d-doc"

RDEPENDS:${PN} += ""

inherit rpm
