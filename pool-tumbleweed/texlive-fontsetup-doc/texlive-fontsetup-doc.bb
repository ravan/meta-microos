SUMMARY = "Documentation for texlive-fontsetup"
DESCRIPTION = "This package includes the documentation for texlive-fontsetup"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.3.0svn77682"

RPM_NAME = "texlive-fontsetup-doc-2026.226.2.3.0svn77682-60.2.noarch.rpm"
RPM_HASH = "7eeb9cab3cc61cfd75ca09961cf8c4f431b5ecc8090bc40afc8dbb5d1a1a7c2dfb0074224980f0d42c864907af3cdb1d62502a8bcc4a934b84c3d93874553e1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fontsetup-doc"

RDEPENDS:${PN} += ""

inherit rpm
