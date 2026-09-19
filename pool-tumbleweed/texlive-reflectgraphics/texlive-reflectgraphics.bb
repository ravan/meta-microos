SUMMARY = "Techniques for reflecting graphics"
DESCRIPTION = "The package provides a macro for reflecting images, in a number \
of different ways, in pursuit of 'more striking' graphics in a \
document."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2csvn40612"

RPM_NAME = "texlive-reflectgraphics-2026.226.0.0.2csvn40612-60.4.noarch.rpm"
RPM_HASH = "992808a321a8175d2cdf87830183aef8261a9cb51281bc66a49bbc7dc7c63abb1de83ce29ca7c1055b7198e236ece37ef360bfedab2aa0f93f1a9bfda541d3f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-reflectgraphics.sty \
texlive-reflectgraphics"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-color.cfg \
tex-graphicx.sty \
tex-keyval.sty \
tex-kvoptions.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
