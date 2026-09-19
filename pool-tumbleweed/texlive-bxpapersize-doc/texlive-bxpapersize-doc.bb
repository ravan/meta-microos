SUMMARY = "Documentation for texlive-bxpapersize"
DESCRIPTION = "This package includes the documentation for texlive-bxpapersize"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.6svn63174"

RPM_NAME = "texlive-bxpapersize-doc-2026.226.0.0.6svn63174-59.2.noarch.rpm"
RPM_HASH = "329a20953eb2b46e2c9b8a2b3cb18d9f23e7da1f089b29d7f1cabb48769e02de1a8d328a1efac4ca77c65473062d3f90c6eb0bc268fd266a50edea14a93d1c92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bxpapersize-doc"

RDEPENDS:${PN} += ""

inherit rpm
