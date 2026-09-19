SUMMARY = "Documentation for texlive-uni-wtal-lin"
DESCRIPTION = "This package includes the documentation for texlive-uni-wtal-lin"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn31409"

RPM_NAME = "texlive-uni-wtal-lin-doc-2026.226.0.0.2svn31409-60.2.noarch.rpm"
RPM_HASH = "51f05307486ed3116302a605aade1bddd07f56ee99c4101be2a84cb01a2871e71f1bf7805ff82bc770d31822df34a8f20548fdc8c8469dab244a238b48090211"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-uni-wtal-lin-doc-de;en \
texlive-uni-wtal-lin-doc"

RDEPENDS:${PN} += ""

inherit rpm
