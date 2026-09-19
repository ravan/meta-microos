SUMMARY = "Documentation for texlive-standardsectioning"
DESCRIPTION = "This package includes the documentation for texlive-standardsectioning"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.10svn76431"

RPM_NAME = "texlive-standardsectioning-doc-2026.226.0.0.10svn76431-64.2.noarch.rpm"
RPM_HASH = "17b2faa17cb91bbd3dda27ea91cd2a5d1937ecb09e21d7aad1903fec3f7718c5e3d3713f01df08ae30f0799e0c08292d3e93e81e9a64d5e230e27ac37047f271"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-standardsectioning-doc"

RDEPENDS:${PN} += ""

inherit rpm
