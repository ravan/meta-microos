SUMMARY = "A package for typesetting epigraphs"
DESCRIPTION = "Epigraphs are the pithy quotations often found at the start (or \
end) of a chapter. Both single epigraphs and lists of epigraphs \
are catered for. Various aspects are easily configurable."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5esvn77682"

RPM_NAME = "texlive-epigraph-2026.226.1.5esvn77682-61.4.noarch.rpm"
RPM_HASH = "b3e1602989f195f8ad9fd4c6f3ebc2630fd36ac8e995bf4d118cee53babec011af4597e6054bfc2deec990e49c0a3af379c0a8764d7502dd60c040baf4fe4adc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-epigraph.sty \
texlive-epigraph"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-nextpage.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
