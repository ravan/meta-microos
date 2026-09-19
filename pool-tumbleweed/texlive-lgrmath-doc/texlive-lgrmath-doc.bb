SUMMARY = "Documentation for texlive-lgrmath"
DESCRIPTION = "This package includes the documentation for texlive-lgrmath"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn65038"

RPM_NAME = "texlive-lgrmath-doc-2026.226.1.0svn65038-61.2.noarch.rpm"
RPM_HASH = "8d4e4e2fb2f285fbb9349d1bea19d2ad29b073784b3263c9ab0cf0e338652cf35487b0486976f01e3deb326ed005b0f8c2e5ad3733d12c2dd801ec3726e82a9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lgrmath-doc"

RDEPENDS:${PN} += ""

inherit rpm
