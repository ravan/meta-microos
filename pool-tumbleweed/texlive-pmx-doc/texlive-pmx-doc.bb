SUMMARY = "Documentation for texlive-pmx"
DESCRIPTION = "This package includes the documentation for texlive-pmx"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.3.00svn75301"

RPM_NAME = "texlive-pmx-doc-2026.226.3.00svn75301-59.2.noarch.rpm"
RPM_HASH = "a1b2bcd388726698a24d42437e0f5ecbb2efa7e8d64eff2ce3df5be9e23b627058864feaa2d97b26ee08698400d7d525888f510516358709e7545ea684933c0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-pmxab.1 \
man-scor2prt.1 \
texlive-pmx-doc"

RDEPENDS:${PN} += ""

inherit rpm
