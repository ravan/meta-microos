SUMMARY = "Documentation for texlive-texfot"
DESCRIPTION = "This package includes the documentation for texlive-texfot"
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "2026.227.1.54svn77286"

RPM_NAME = "texlive-texfot-doc-2026.227.1.54svn77286-62.2.noarch.rpm"
RPM_HASH = "e08dce629c22f9b99871c91f9cf5521b6e8b16f252efbb566653f178239c9ef15ed4b493776eed6d81ba2981a766f169f41ead1c43f661c5da86107e3b75e87a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-texfot.1 \
texlive-texfot-doc"

RDEPENDS:${PN} += ""

inherit rpm
