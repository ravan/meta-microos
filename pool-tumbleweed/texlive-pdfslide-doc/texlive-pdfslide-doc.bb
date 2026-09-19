SUMMARY = "Documentation for texlive-pdfslide"
DESCRIPTION = "This package includes the documentation for texlive-pdfslide"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-pdfslide-doc-2026.226.svn15878-58.2.noarch.rpm"
RPM_HASH = "4570319d796e1a3fa878a72282f5d547f6873a31ccea40b42a417504464803ebc9f0256e5f5e08ad7e4ed7204906b6b2a91a72893069afc3374e2b8230e77848"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfslide-doc"

RDEPENDS:${PN} += ""

inherit rpm
