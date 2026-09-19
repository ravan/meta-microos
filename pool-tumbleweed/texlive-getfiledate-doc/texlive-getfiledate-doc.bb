SUMMARY = "Documentation for texlive-getfiledate"
DESCRIPTION = "This package includes the documentation for texlive-getfiledate"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn16189"

RPM_NAME = "texlive-getfiledate-doc-2026.226.1.2svn16189-60.2.noarch.rpm"
RPM_HASH = "d9dc57c85f0cd8f277eeebec78cac2da5591dd83a70b1680237d11108698c7e16e3b92bb117c1d904e72a2f4af7a96626d598b94e2fda144041017dfa4b1d956"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-getfiledate-doc"

RDEPENDS:${PN} += ""

inherit rpm
