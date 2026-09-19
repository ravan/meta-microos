SUMMARY = "Documentation for texlive-menu"
DESCRIPTION = "This package includes the documentation for texlive-menu"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.994svn15878"

RPM_NAME = "texlive-menu-doc-2026.226.0.0.994svn15878-61.2.noarch.rpm"
RPM_HASH = "e1d8cac80a7bd2bc1f5ee3d65df1e70e630355233cbc4eedd382767f42d2c740ed4dccab5e4a522bab4d6a9941f35a126942fca977eaecb623773d1bbc3075e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-menu-doc"

RDEPENDS:${PN} += ""

inherit rpm
