SUMMARY = "Documentation for texlive-pst-poly"
DESCRIPTION = "This package includes the documentation for texlive-pst-poly"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.63svn35062"

RPM_NAME = "texlive-pst-poly-doc-2026.226.1.63svn35062-60.4.noarch.rpm"
RPM_HASH = "6920502776bd06c252fc079f0a31dc36a4728713314e9f05bc221b5503ec132da04550751de379c048476e322918b7ebbe6534b0916ba7af321b0ce622763778"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-poly-doc"

RDEPENDS:${PN} += ""

inherit rpm
