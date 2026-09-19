SUMMARY = "Documentation for texlive-piano"
DESCRIPTION = "This package includes the documentation for texlive-piano"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-piano-doc-2026.226.1.0svn77682-58.2.noarch.rpm"
RPM_HASH = "f5d3e19d67388170c81d69553e2f63db93b6212d51fb058db2501bd956044e2255d2864dc6cfff86b2d314732d912b5004df7a5b6779d252cdaf5c7df85bfea3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-piano-doc"

RDEPENDS:${PN} += ""

inherit rpm
