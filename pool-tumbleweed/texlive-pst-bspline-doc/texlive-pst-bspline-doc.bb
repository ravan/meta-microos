SUMMARY = "Documentation for texlive-pst-bspline"
DESCRIPTION = "This package includes the documentation for texlive-pst-bspline"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.62svn40685"

RPM_NAME = "texlive-pst-bspline-doc-2026.226.1.62svn40685-59.2.noarch.rpm"
RPM_HASH = "02661fe87d8397647cf6251d0cc6ecb6f27bcc13734a0e14d6e6a758f53162243bb9f8a45a33043200ec3fbed379206a24ba7964a44d4b620facef519f4c9664"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-bspline-doc"

RDEPENDS:${PN} += ""

inherit rpm
