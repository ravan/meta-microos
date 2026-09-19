SUMMARY = "Documentation for texlive-tabu"
DESCRIPTION = "This package includes the documentation for texlive-tabu"
LICENSE = "LPPL-1.0"

PV = "2026.227.2.9svn77682"

RPM_NAME = "texlive-tabu-doc-2026.227.2.9svn77682-62.2.noarch.rpm"
RPM_HASH = "3594c6a6cef5e30e0d55291a9b392e24df2087b0fa47e87295a6976ceb1dee845916809abc5b0c96b9a98342ac6c3e199c15f82b30643d8e965a77d21e3719a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tabu-doc"

RDEPENDS:${PN} += ""

inherit rpm
