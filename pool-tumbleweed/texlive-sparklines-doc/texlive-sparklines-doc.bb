SUMMARY = "Documentation for texlive-sparklines"
DESCRIPTION = "This package includes the documentation for texlive-sparklines"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.7svn42821"

RPM_NAME = "texlive-sparklines-doc-2026.226.1.7svn42821-64.2.noarch.rpm"
RPM_HASH = "e25932b28f05bcd6804b75c38661e77fe546c050cd0ec83504ccf870595ca05b44055f63e4e7e28d4d6c9eaf110e26eeda089c18641dcb3271520fb71079bc92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sparklines-doc"

RDEPENDS:${PN} += ""

inherit rpm
