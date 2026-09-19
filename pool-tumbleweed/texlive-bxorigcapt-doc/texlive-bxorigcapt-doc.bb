SUMMARY = "Documentation for texlive-bxorigcapt"
DESCRIPTION = "This package includes the documentation for texlive-bxorigcapt"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn64072"

RPM_NAME = "texlive-bxorigcapt-doc-2026.226.1.0svn64072-59.2.noarch.rpm"
RPM_HASH = "70b53c54c85d8328702b0ae27e03c817b6964bfd9bc89ee4f35632cba662b7c8f89f6a321446bd8801c150274541bd888793a3305f0d5dccf04048119d17dd58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bxorigcapt-doc"

RDEPENDS:${PN} += ""

inherit rpm
