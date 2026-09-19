SUMMARY = "Documentation for texlive-miniplot"
DESCRIPTION = "This package includes the documentation for texlive-miniplot"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn17483"

RPM_NAME = "texlive-miniplot-doc-2026.226.svn17483-61.2.noarch.rpm"
RPM_HASH = "efdc205ce4a941612baa94a70e3b9e7c4031c2d7337d2ae15f9014423e465cfbcfa879d8082bfc669376174c6779d1cf3353e916248095f928f057e2994ed609"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-miniplot-doc"

RDEPENDS:${PN} += ""

inherit rpm
