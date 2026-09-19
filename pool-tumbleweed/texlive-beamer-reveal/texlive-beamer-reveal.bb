SUMMARY = "Convert beamer slides to reveal.js HTML presentations"
DESCRIPTION = "Beamer is a very powerful and convenient document class to \
create presentations and slides. However, integrating \
multimedia in it, is still a bit of a faff. The (limited) \
functionality heavily relies on the availability of acroread. \
This package allows you to convert your beamer presentation to \
the reveal.js framework, rendering your presentation as an HTML \
website in your browser. This allows for easy incorporation of \
videos, audio fragments, iframe chunks, images and LaTeX \
animations."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.09svn77675"

RPM_NAME = "texlive-beamer-reveal-2026.226.1.09svn77675-61.2.noarch.rpm"
RPM_HASH = "22d38c1a459fa42464a037d44722a5ace00d68d5f106b6a43c60ff6816a8f716e75a7a746d37550f68c1b7b4382c5e13b6612ab2e433cea702d9b92c3f1d441b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamer-reveal.sty \
texlive-beamer-reveal"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-currfile.sty \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-tikz.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
