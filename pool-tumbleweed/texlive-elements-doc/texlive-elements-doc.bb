SUMMARY = "Documentation for texlive-elements"
DESCRIPTION = "This package includes the documentation for texlive-elements"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4svn61792"

RPM_NAME = "texlive-elements-doc-2026.226.0.0.4svn61792-61.4.noarch.rpm"
RPM_HASH = "37d3740dff08e23e764a74a82f50738f2bd5ce35e685fdd88f6bb534f1b549bc346954853c6241e1691db74702f3cd3ab0d702fb36b64ec299c43bd2ec0d4742"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-elements-doc"

RDEPENDS:${PN} += ""

inherit rpm
