SUMMARY = "Documentation for texlive-expex"
DESCRIPTION = "This package includes the documentation for texlive-expex"
LICENSE = "LPPL-1.0"

PV = "2026.226.5.1bsvn77682"

RPM_NAME = "texlive-expex-doc-2026.226.5.1bsvn77682-59.2.noarch.rpm"
RPM_HASH = "6054a8da2b7e8aaa8cb3d91d70d889949e0627a5e965c4f054203d9055c92ee04d13553d5717ba0a431fa6248aa8c0edd8b5bbb28078d3f40f58ce0ceeb04a14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-expex-doc"

RDEPENDS:${PN} += ""

inherit rpm
