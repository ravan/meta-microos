SUMMARY = "Documentation for texlive-chordbars"
DESCRIPTION = "This package includes the documentation for texlive-chordbars"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3.2svn70392"

RPM_NAME = "texlive-chordbars-doc-2026.226.1.3.2svn70392-60.2.noarch.rpm"
RPM_HASH = "363976b3eff2cb08d86d9a60a3f2ba786792746708d9829235d3e056a52a3702a9d83f50cc9aa1d65dcfc1125c11511f94e9583cc2841aca2d930115a9432180"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chordbars-doc"

RDEPENDS:${PN} += ""

inherit rpm
