SUMMARY = "Framed environments that can split at page boundaries"
DESCRIPTION = "The package develops the facilities of framed in providing \
breakable framed and coloured boxes. The user may instruct the \
package to perform its operations using default LaTeX commands, \
PStricks or TikZ."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.9bsvn77682"

RPM_NAME = "texlive-mdframed-2026.226.1.9bsvn77682-59.2.noarch.rpm"
RPM_HASH = "dd429a72ff092ca5f90ee26f0554ad770784e63e1dfa9e6a87249032a9c9e51cfa732484205211b41043e9820c407e68864fce2004a525998389521e208ce084"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ltxmdf.cls \
tex-mdframed.sty \
texlive-mdframed"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-array.sty \
tex-beramono.sty \
tex-booktabs.sty \
tex-color.sty \
tex-csquotes.sty \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-expl3.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hypdoc.sty \
tex-ifluatex.sty \
tex-ifxetex.sty \
tex-kantlipsum.sty \
tex-kvoptions.sty \
tex-l3keys2e.sty \
tex-lipsum.sty \
tex-listings.sty \
tex-microtype.sty \
tex-multicol.sty \
tex-needspace.sty \
tex-ntheorem.sty \
tex-selinput.sty \
tex-showframe.sty \
tex-tikz.sty \
tex-xcolor.sty \
tex-xparse.sty \
tex-xspace.sty \
tex-zref-abspage.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
