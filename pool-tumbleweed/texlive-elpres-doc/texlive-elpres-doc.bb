SUMMARY = "Documentation for texlive-elpres"
DESCRIPTION = "This package includes the documentation for texlive-elpres"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn76790"

RPM_NAME = "texlive-elpres-doc-2026.226.1.1svn76790-61.4.noarch.rpm"
RPM_HASH = "cd0d25088a9159d0536e4569367411ad080ffb3f73d98d54dcfa6a4dfffeaa09205e1032ef4cb9ca0a63b186d9a3d93610376e50054befd6f6a3a0d5c6586979"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-elpres-doc"

RDEPENDS:${PN} += ""

inherit rpm
