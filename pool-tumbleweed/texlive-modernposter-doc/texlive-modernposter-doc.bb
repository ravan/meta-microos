SUMMARY = "Documentation for texlive-modernposter"
DESCRIPTION = "This package includes the documentation for texlive-modernposter"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.03.1svn47269"

RPM_NAME = "texlive-modernposter-doc-2026.226.1.03.1svn47269-61.2.noarch.rpm"
RPM_HASH = "523e08996360844d0f98e41dbfa136828168252a90cb6a5e3c257c3e193e6ebce47d968177072f6dc98f7085da4616142ab55d23c85cffa16855f364377bb7b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-modernposter-doc"

RDEPENDS:${PN} += ""

inherit rpm
