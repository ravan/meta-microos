SUMMARY = "Documentation for texlive-garamond-math"
DESCRIPTION = "This package includes the documentation for texlive-garamond-math"
LICENSE = "OFL-1.1"

PV = "2026.226.svn61481"

RPM_NAME = "texlive-garamond-math-doc-2026.226.svn61481-60.2.noarch.rpm"
RPM_HASH = "83a9a40f13bec0cdd2aa43e65ab717f760b747c22322c53b468be9260eb91f55c4bb913d9d99a8f2c7286b6379368fcfd4bb28a8f5ce7f9e6336edd88ac69a5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-garamond-math-doc"

RDEPENDS:${PN} += ""

inherit rpm
