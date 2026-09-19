SUMMARY = "Use color definitions from latexcolor.com"
DESCRIPTION = "Built on top of the xcolor package, the latexcolors package \
defines the set of colors shown on latexcolor.com for use in \
documents typeset with LaTeX & friends."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1asvn49888"

RPM_NAME = "texlive-latexcolors-2026.226.0.0.1asvn49888-61.2.noarch.rpm"
RPM_HASH = "04fee28916a2fb82e0c975b99de6bde9b90053aac4d2469066904cb1487754dafd24ed880582ac727e701ce5ec2a87cb4e890955cd267bed6494b36863049e1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-latexcolors.sty \
texlive-latexcolors"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
