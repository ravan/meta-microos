SUMMARY = "Documentation for texlive-figsize"
DESCRIPTION = "This package includes the documentation for texlive-figsize"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn18784"

RPM_NAME = "texlive-figsize-doc-2026.226.0.0.1svn18784-59.2.noarch.rpm"
RPM_HASH = "cbacdbdf0b7ee32e929755a28e38e044229833d65d12ad7451996721b37fb032f67609c6c643b29a5b8164a9d7451a67f23097c9e942b7b1db182f90743abb2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-figsize-doc"

RDEPENDS:${PN} += ""

inherit rpm
