SUMMARY = "Placement of background material on pages of a document"
DESCRIPTION = "The package offers the placement of background material on the \
pages of a document. The user can control many aspects \
(contents, position, color, opacity) of the background material \
that will be displayed; all placement and attribute settings \
are controlled by setting key values. The package makes use of \
the everypage package, and uses pgf/tikz for attribute control."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn42428"

RPM_NAME = "texlive-background-2026.226.2.1svn42428-60.2.noarch.rpm"
RPM_HASH = "339f0abca527117c3476721a6832bbfe64b12580e7af12b85f041bf25d2aad7389ead03c2dace2d9c5df221309cd15d2b65a8ca23bf9df0354898672130249a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-background.sty \
texlive-background"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-afterpage.sty \
tex-everypage.sty \
tex-tikz.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
