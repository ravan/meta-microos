SUMMARY = "Documentation for texlive-biblatex-oxref"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-oxref"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.3svn72164"

RPM_NAME = "texlive-biblatex-oxref-doc-2026.226.3.3svn72164-61.2.noarch.rpm"
RPM_HASH = "c8f82dbbe15aa48febbd14824585652151e750fd244203b8863e56150712f88c8fcc08207c48b400a68ea460ef3b719763d9dde375d0975b1dfc48ad09f2e165"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-oxref-doc"

RDEPENDS:${PN} += ""

inherit rpm
