SUMMARY = "Documentation for texlive-autoaligne"
DESCRIPTION = "This package includes the documentation for texlive-autoaligne"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn77682"

RPM_NAME = "texlive-autoaligne-doc-2026.226.1.5svn77682-60.2.noarch.rpm"
RPM_HASH = "7121b3500ce3b13a4bb130e77c2f5ed0fa3d928cc5e86806ea024c2d70f6a74a636df2a082895c9d825d25cfe841baf1ea887d6190617c38ee92ad3aa63acc0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-autoaligne-doc-fr \
texlive-autoaligne-doc"

RDEPENDS:${PN} += ""

inherit rpm
