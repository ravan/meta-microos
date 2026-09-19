SUMMARY = "Documentation for texlive-soul"
DESCRIPTION = "This package includes the documentation for texlive-soul"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.1svn77682"

RPM_NAME = "texlive-soul-doc-2026.226.3.1svn77682-64.2.noarch.rpm"
RPM_HASH = "47a67d8e40034c1fb06de25368e6ffe5027b0718f1857d67c2e1d10ba71cadf02bd9db6b1b08048e519a2d76ae3f1d5ee25667caf71dda2c2b84a62c9efe1180"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-soul-doc"

RDEPENDS:${PN} += ""

inherit rpm
