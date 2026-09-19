SUMMARY = "Documentation for texlive-biblatex-publist"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-publist"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.16svn77682"

RPM_NAME = "texlive-biblatex-publist-doc-2026.226.2.16svn77682-61.2.noarch.rpm"
RPM_HASH = "d565e6bc83a78eae42a171079587d1b13543bf600d9431313f55ff2260ddf3fed8dd2ac254a1a981d48dd669073548fb9c3c8cbd4d36e2050ac962ec7432dcd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-publist-doc"

RDEPENDS:${PN} += ""

inherit rpm
