SUMMARY = "Documentation for texlive-chemfig"
DESCRIPTION = "This package includes the documentation for texlive-chemfig"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.71svn77682"

RPM_NAME = "texlive-chemfig-doc-2026.226.1.71svn77682-60.2.noarch.rpm"
RPM_HASH = "b82f20046656148ec3806c6072a7ecc1cae95be0b908cf1a80f36ffa35db62717e210067cd1c9176af5cb708de63119454ce28dc1e6a4f2ec8d3e06b153b7195"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-chemfig-doc-en;fr \
texlive-chemfig-doc"

RDEPENDS:${PN} += ""

inherit rpm
