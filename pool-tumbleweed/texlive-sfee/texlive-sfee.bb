SUMMARY = "A LaTeX class for the Smart Factory and Energy Efficence magazine of the Tecnologico"
DESCRIPTION = "The SFEE class belongs to the Smart Factory and Energy \
Efficence magazine of the Tecnologico Nacional de Mexico/ITS \
Purisima del Rincon. SFEE.cls was designed using the LaTeX \
document class standard. It is accompanied by SFEE.bst, which \
provides the necessary elements to generate the article \
citations."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn70718"

RPM_NAME = "texlive-sfee-2026.226.1.0svn70718-60.2.noarch.rpm"
RPM_HASH = "3e9cf7db4ac46721cf01562190d7f99e8a0525bfd158e6fc9b5af17f773ac7cb10b0edbfdd692fa0fe973ec54621a49a5f2c0364e7942ed75a812374591ea17b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-SFEE.cls \
texlive-sfee"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-academicons.sty \
tex-authblk.sty \
tex-ccicons.sty \
tex-color.sty \
tex-datetime.sty \
tex-etoolbox.sty \
tex-graphicx.sty \
tex-mdframed.sty \
tex-paper.cls \
tex-svg.sty \
tex-xcolor.sty \
tex-yfonts.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
