SUMMARY = "Documentation for texlive-wheelchart"
DESCRIPTION = "This package includes the documentation for texlive-wheelchart"
LICENSE = "LPPL-1.0"

PV = "2026.226.5.0svn78219"

RPM_NAME = "texlive-wheelchart-doc-2026.226.5.0svn78219-60.2.noarch.rpm"
RPM_HASH = "ab02f7d8803e076a86f8c75afb8d72f7e117def9049bcc626e77924a9872ac2d4169e0adcf98790c846505de0d29403dc4c70e3571e66f411ca1658df72b2116"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-wheelchart-doc"

RDEPENDS:${PN} += ""

inherit rpm
