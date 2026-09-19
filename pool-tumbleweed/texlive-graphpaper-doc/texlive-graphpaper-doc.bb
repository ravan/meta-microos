SUMMARY = "Documentation for texlive-graphpaper"
DESCRIPTION = "This package includes the documentation for texlive-graphpaper"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn63116"

RPM_NAME = "texlive-graphpaper-doc-2026.226.1.1svn63116-60.4.noarch.rpm"
RPM_HASH = "2e3008aa8e2cf4594d6977785944b0a2b89c644e2423abe4e97741b5eb63bc55469890dd9ef002155418956de6265a735b7b7bc1eaa6e2b561fd2912602f9dc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-graphpaper-doc"

RDEPENDS:${PN} += ""

inherit rpm
