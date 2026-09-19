SUMMARY = "Documentation for texlive-latexmk"
DESCRIPTION = "This package includes the documentation for texlive-latexmk"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.4.87svn75540"

RPM_NAME = "texlive-latexmk-doc-2026.226.4.87svn75540-61.2.noarch.rpm"
RPM_HASH = "e8a5c8ca2aa01c1acec7700ed42b091b4accc50df345fa8f5b32dfa1be222f6efe78e1f8f2d88bc353d2be171f02816422cc7c8da3241e455f8cb12ffc9a28a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-latexmk.1 \
texlive-latexmk-doc"

RDEPENDS:${PN} += "/usr/bin/csh \
/usr/bin/sh"

inherit rpm
