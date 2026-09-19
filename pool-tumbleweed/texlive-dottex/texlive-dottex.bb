SUMMARY = "Use dot code in LaTeX"
DESCRIPTION = "The dottex package allows you to encapsulate 'dot' and 'neato' \
files in your document (dot and neato are both part of \
graphviz; dot creates directed graphs, neato undirected \
graphs). If you have shell-escape enabled, the package will \
arrange for your files to be processed at LaTeX time; \
otherwise, the conversion must be done manually as an \
intermediate process before a second LaTeX run."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.6svn15878"

RPM_NAME = "texlive-dottex-2026.226.0.0.6svn15878-59.2.noarch.rpm"
RPM_HASH = "84760839f370eea56e1f7575e31b87eef3a7db92f4a54f40dffd2d70b065a6a9d33a9090ae0f571c87158a002a20cc952cfc2b9028bebeafa59cdf74eb04333e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dottex.sty \
texlive-dottex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-keyval.sty \
tex-moreverb.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
