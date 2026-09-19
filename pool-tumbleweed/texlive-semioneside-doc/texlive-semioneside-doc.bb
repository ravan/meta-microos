SUMMARY = "Documentation for texlive-semioneside"
DESCRIPTION = "This package includes the documentation for texlive-semioneside"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.41svn15878"

RPM_NAME = "texlive-semioneside-doc-2026.226.0.0.41svn15878-60.2.noarch.rpm"
RPM_HASH = "efd5f0516c1ba7911136f5063e0b66977a12ef6d80440eebc702bf0ab1b98d01d274207118db7282e636b7554e19280a1bed1b433d3f382afb17bd3eccec47dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-semioneside-doc"

RDEPENDS:${PN} += ""

inherit rpm
