SUMMARY = "Documentation for texlive-dot2texi"
DESCRIPTION = "This package includes the documentation for texlive-dot2texi"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.3.0svn26237"

RPM_NAME = "texlive-dot2texi-doc-2026.226.3.0svn26237-59.2.noarch.rpm"
RPM_HASH = "9c52160f8cf4c732ea2cd5d9099b43f8c98c8028348461cffe4b4b644a8cd27d8d2cd4cbf2f329d6eb7dfdfac8055bb7f73167c93e767c6e7a9ad1ac1faf5b59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dot2texi-doc"

RDEPENDS:${PN} += ""

inherit rpm
