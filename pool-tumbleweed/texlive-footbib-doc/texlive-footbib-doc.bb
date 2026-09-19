SUMMARY = "Documentation for texlive-footbib"
DESCRIPTION = "This package includes the documentation for texlive-footbib"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0.7svn17115"

RPM_NAME = "texlive-footbib-doc-2026.226.2.0.7svn17115-60.2.noarch.rpm"
RPM_HASH = "c56d2b7e3fef2e4c06c9aeb4cf6b8c80345c582df5c889ecc3b65c7b60c3d819ab372d2b482a080a525dc4ce2ea41290157e136c3a62eea90bf542b908101964"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-footbib-doc"

RDEPENDS:${PN} += ""

inherit rpm
