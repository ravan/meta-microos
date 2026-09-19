SUMMARY = "Documentation for texlive-facsimile"
DESCRIPTION = "This package includes the documentation for texlive-facsimile"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn21328"

RPM_NAME = "texlive-facsimile-doc-2026.226.1.0svn21328-59.2.noarch.rpm"
RPM_HASH = "dae99619a6a9c6f6fe07bc87fda753d52ddaeda19c88e3f7d4a08a3f4773527f61a412071a502be6b69e5c5d3eb4c6f6a7cb6aa80ca00b8997c22d531148b8aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-facsimile-doc"

RDEPENDS:${PN} += ""

inherit rpm
