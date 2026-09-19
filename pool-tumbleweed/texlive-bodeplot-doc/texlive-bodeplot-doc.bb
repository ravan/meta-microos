SUMMARY = "Documentation for texlive-bodeplot"
DESCRIPTION = "This package includes the documentation for texlive-bodeplot"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.0.3svn77390"

RPM_NAME = "texlive-bodeplot-doc-2026.226.3.0.3svn77390-59.2.noarch.rpm"
RPM_HASH = "29141fda09871a4b25ed82bf8cab3426b5c1a98467c877d01a2040b7b8ac8b668d2a52a6b57b212b45fb5be99c613daef098e51b15a56e4c09689e1b4fc29143"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bodeplot-doc"

RDEPENDS:${PN} += ""

inherit rpm
