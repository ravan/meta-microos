SUMMARY = "Documentation for texlive-texfindpkg"
DESCRIPTION = "This package includes the documentation for texlive-texfindpkg"
LICENSE = "GPL-2.0-or-later"

PV = "2026.227.2024asvn72937"

RPM_NAME = "texlive-texfindpkg-doc-2026.227.2024asvn72937-62.2.noarch.rpm"
RPM_HASH = "3e1b78068936b098816f2324fc00268f7c278894e1059889efdfac428995e219ba1d294110ea043acc148250f2555750109a1bdbf64b61883e43940b1446e67e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-texfindpkg.1 \
texlive-texfindpkg-doc"

RDEPENDS:${PN} += ""

inherit rpm
