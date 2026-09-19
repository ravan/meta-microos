SUMMARY = "Class for Michigan State University Master's and PhD theses"
DESCRIPTION = "This is a class file for producing dissertations and theses \
according to the Michigan State University Graduate School \
Guidelines for Electronic Submission of Master's Theses and \
Dissertations. The class should meet all current requirements \
and is updated whenever the university guidelines change. The \
class is based on the memoir document class, and inherits the \
functionality of that class."
LICENSE = "LPPL-1.0"

PV = "2026.226.4.3bsvn71883"

RPM_NAME = "texlive-msu-thesis-2026.226.4.3bsvn71883-61.2.noarch.rpm"
RPM_HASH = "0db02b831b4f7bda717a608b55c19bad9a75543e5c1566057fdbee27f187d965900b0994cea4bcf56760df56432d62b66b6dd8633179d11d99e3f9c29d2fcdbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-msu-thesis.cls \
texlive-msu-thesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etex.sty \
tex-etoolbox.sty \
tex-expl3.sty \
tex-memoir.cls \
tex-pdflscape.sty \
tex-textpos.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
