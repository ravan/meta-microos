SUMMARY = "Create interactive figures in LaTeX"
DESCRIPTION = "FigPut allows figures to be specified using JavaScript. The \
resulting document can be viewed as a static PDF, as usual, or \
the document can be viewed in a web-browser, in which case the \
figures are interactive. A variety of interactive widgets are \
included."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.90svn76924"

RPM_NAME = "texlive-figput-2026.226.0.0.90svn76924-59.2.noarch.rpm"
RPM_HASH = "26e8faca684a4147576936c148eb692667ad48ca911df3cb4f5ef48cdce29fc250c6a92a1512863245ce4dd90e5758b4de30d9825e973ae3a774d3d11c3fe503"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-figput.sty \
texlive-figput"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
tex-verbatim.sty \
tex-xsim.sty \
tex-zref-abspage.sty \
tex-zref-pagelayout.sty \
tex-zref-savepos.sty \
tex-zref-thepage.sty \
tex-zref-user.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
