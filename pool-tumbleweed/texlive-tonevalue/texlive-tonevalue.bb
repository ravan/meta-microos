SUMMARY = "Tool for linguists and phoneticians to visualize tone value patterns"
DESCRIPTION = "This package provides a TikZ-based solution to typeset \
visualisations of tone values. Currently, unt's model is \
implemented. Support for more models is planned."
LICENSE = "Apache-1.0"

PV = "2026.226.1.0svn60058"

RPM_NAME = "texlive-tonevalue-2026.226.1.0svn60058-59.2.noarch.rpm"
RPM_HASH = "5be31a2119b08eff99d25637d44a3ea2057a64881365d872f1223085da8e2089099d155a9bbeba8fefc30f67dd9a333ed22d62ea26080394b70d834dc36b4fd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tonevalue.sty \
texlive-tonevalue"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-contour.sty \
tex-etoolbox.sty \
tex-listofitems.sty \
tex-tikz.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
