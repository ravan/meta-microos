SUMMARY = "Class for writing 'juristische Hausarbeiten' at German Universities"
DESCRIPTION = "The class was developed for use by students writing legal \
essays ('juristische Hausarbeit') at German Universities. It is \
based on jurabook and jurabib and makes it easy for LaTeX \
beginners to get a correct and nicely formatted paper."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1.0svn56070"

RPM_NAME = "texlive-hausarbeit-jura-2026.226.2.1.0svn56070-60.4.noarch.rpm"
RPM_HASH = "d4df211b49aac39cf73e0d567f57d63a230386d3bc7fb296feb6c8bf3661874618313e2712475723d3659e757b7e9058de5780710eda89aaa818f67f42ac342c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hausarbeit-jura.cls \
texlive-hausarbeit-jura"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-courier.sty \
tex-csquotes.sty \
tex-ellipsis.sty \
tex-eurosym.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-geometry.sty \
tex-helvet.sty \
tex-iftex.sty \
tex-ifthen.sty \
tex-indentfirst.sty \
tex-inputenc.sty \
tex-jurabib.sty \
tex-jurabook.cls \
tex-mathptmx.sty \
tex-microtype.sty \
tex-textcomp.sty \
tex-tgcursor.sty \
tex-tgheros.sty \
tex-tgtermes.sty \
tex-varioref.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
