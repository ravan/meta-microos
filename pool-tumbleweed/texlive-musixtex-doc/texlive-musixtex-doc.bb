SUMMARY = "Documentation for texlive-musixtex"
DESCRIPTION = "This package includes the documentation for texlive-musixtex"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.41svn77682"

RPM_NAME = "texlive-musixtex-doc-2026.226.1.41svn77682-61.2.noarch.rpm"
RPM_HASH = "f84032dc186c689a426694806c08482fb38a387ad634c1b84b658d58833a0cb0be274f72187d587e4562160af5252e56299ccd281e01ccb4a0915b076d6f66ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-musixflx.1 \
man-musixtex.1 \
texlive-musixtex-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
