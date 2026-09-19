SUMMARY = "Documentation for texlive-parades"
DESCRIPTION = "This package includes the documentation for texlive-parades"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn40042"

RPM_NAME = "texlive-parades-doc-2026.226.svn40042-58.2.noarch.rpm"
RPM_HASH = "5c0ef9ce2bb86305a3d6cf89e0a754378b4aec55c1463c6e126cbfc966bf512399f7b56fc80a84fed3fe3db05d8756aabc67ee25693236ca9bcac88818565f61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-parades-doc"

RDEPENDS:${PN} += ""

inherit rpm
