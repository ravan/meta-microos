SUMMARY = "Documentation for texlive-diagmac2"
DESCRIPTION = "This package includes the documentation for texlive-diagmac2"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn15878"

RPM_NAME = "texlive-diagmac2-doc-2026.226.2.1svn15878-59.2.noarch.rpm"
RPM_HASH = "12d2cb18692d8c795e92fbbc2b8bc158af7d1dbf4f2beae1fb732d01bb6a4b1ff80bdb74446cb0e9c4c9e038331d3a0f5182f3858572a917a0a0522b3d3ecf6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-diagmac2-doc"

RDEPENDS:${PN} += ""

inherit rpm
