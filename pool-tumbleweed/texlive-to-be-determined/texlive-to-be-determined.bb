SUMMARY = "Highlight text passages that need further work"
DESCRIPTION = "This package provides a single command \\tbd which highlights \
the pieces of text that need to be rewritten later. You can \
hide them all with a single package option hide, or just make \
them disappear entirely with the option off."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3.2svn72527"

RPM_NAME = "texlive-to-be-determined-2026.226.0.0.3.2svn72527-59.2.noarch.rpm"
RPM_HASH = "043cfdbe0afdf9e74f15d05672076f49d3b0891be18a7d7d643c9dd460e13739e4a04db3ba946ff595e4f3e4bfb8a58f0b721cf95dd82c5bfc983c2d2a9c2392"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-to-be-determined.sty \
texlive-to-be-determined"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-mathtools.sty \
tex-soul.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-soul \
texlive-xcolor"

inherit rpm
