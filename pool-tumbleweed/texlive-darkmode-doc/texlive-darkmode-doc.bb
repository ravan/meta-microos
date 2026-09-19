SUMMARY = "Documentation for texlive-darkmode"
DESCRIPTION = "This package includes the documentation for texlive-darkmode"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.1svn76924"

RPM_NAME = "texlive-darkmode-doc-2026.226.1.0.1svn76924-61.2.noarch.rpm"
RPM_HASH = "34d663806ece1200421fcec1206d7c55fad4aff6ac332635ef7d3480abc7d9ad8f12a33399d3ab27d3f97a8c724dc45554ec67c97e0a209ae11f9a50e5200650"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-darkmode-doc"

RDEPENDS:${PN} += ""

inherit rpm
