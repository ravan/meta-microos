SUMMARY = "Documentation for texlive-count1to"
DESCRIPTION = "This package includes the documentation for texlive-count1to"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.11svn71526"

RPM_NAME = "texlive-count1to-doc-2026.226.2.11svn71526-61.2.noarch.rpm"
RPM_HASH = "db6c8aac54872c70a06b17c93f7c5bab9e89f23847ab046f03c9824c2b289566a97b325c9732b4ae4fd79476e3dcbc638aaf3070a53e26d4de820f96d974a37a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-count1to-doc"

RDEPENDS:${PN} += ""

inherit rpm
