SUMMARY = "Gathering items from a list-like environment"
DESCRIPTION = "This package provides a \\gatheritems command to parse a list of \
data separated by \\item tokens. This makes it easier to define \
custom environments which structure their data in the same way \
that itemize or enumerate do."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn39365"

RPM_NAME = "texlive-getitems-2026.226.1.0svn39365-60.2.noarch.rpm"
RPM_HASH = "2220cddc63fd82ed30b3c02ac4f0ad50006164c98097551f365b928aea2279add3e37da3c544bd2f96a1d94e6ea59bee6b151fd2b2244a8b7fc4da36ef23f684"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-getitems.sty \
texlive-getitems"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-environ.sty \
tex-trimspaces.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
