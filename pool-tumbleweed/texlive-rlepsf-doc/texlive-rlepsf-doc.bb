SUMMARY = "Documentation for texlive-rlepsf"
DESCRIPTION = "This package includes the documentation for texlive-rlepsf"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn19082"

RPM_NAME = "texlive-rlepsf-doc-2026.226.svn19082-60.4.noarch.rpm"
RPM_HASH = "f41595d300b4a7243d74907851aa6d19d578f2acdb1796d621073dfa26ca14b8c3da8d9d0e51d9414828ca2aeb93687bcd765a9cc8aa3b5dcc78290c39794a61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rlepsf-doc"

RDEPENDS:${PN} += ""

inherit rpm
