SUMMARY = "Draw Bayesian networks, graphical models and directed factor graphs"
DESCRIPTION = "The package provides a library supporting the display of \
Bayesian networks, graphical models and (directed) factor \
graphs in LaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.227.0.0.1svn38295"

RPM_NAME = "texlive-tikz-bayesnet-2026.227.0.0.1svn38295-62.2.noarch.rpm"
RPM_HASH = "bcf9d52f219aaead59e2b4638c94f5f49ce2abf225861fffb6f44b923558785bfb742cc9b268bdac2145ed5b05e73f4093171c75a4c38d4403520848db13338f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzlibrarybayesnet.code.tex \
texlive-tikz-bayesnet"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
