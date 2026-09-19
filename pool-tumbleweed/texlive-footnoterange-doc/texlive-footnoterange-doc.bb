SUMMARY = "Documentation for texlive-footnoterange"
DESCRIPTION = "This package includes the documentation for texlive-footnoterange"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1csvn77682"

RPM_NAME = "texlive-footnoterange-doc-2026.226.1.1csvn77682-60.2.noarch.rpm"
RPM_HASH = "dd4a8f0bfb3017a3456eb1639e755320c182a43948f4cdb6a96d2709e9b19036cdd065e12abc49bb50f7d28178dfa620cc24c2db39e070e1cff5ea797e93406d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-footnoterange-doc"

RDEPENDS:${PN} += ""

inherit rpm
