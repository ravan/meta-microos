SUMMARY = "Documentation for texlive-scratchx"
DESCRIPTION = "This package includes the documentation for texlive-scratchx"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn44906"

RPM_NAME = "texlive-scratchx-doc-2026.226.1.1svn44906-60.2.noarch.rpm"
RPM_HASH = "fa2dc933c17ba6fc4f7c5a89e55ec127d2874631516403f2b3d94622773433fe925e1e19f136ac97c65ba9a6f23dc387268487344d2a13c7de5811dbbf183a12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-scratchx-doc-fr \
texlive-scratchx-doc"

RDEPENDS:${PN} += ""

inherit rpm
