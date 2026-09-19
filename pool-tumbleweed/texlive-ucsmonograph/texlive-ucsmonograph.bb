SUMMARY = "Typesetting academic documents from the University of Caxias do Sul"
DESCRIPTION = "This is a LaTeX class for typesetting academic documents \
according to the ABNT (Brazilian Technical Standards \
Association) standards and the UCS (University of Caxias do \
Sul) specifications."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3.0svn52698"

RPM_NAME = "texlive-ucsmonograph-2026.226.1.3.0svn52698-60.2.noarch.rpm"
RPM_HASH = "09302e2177c57cde90f866731e5165940720e75ea4b1cbfa56a171f42fef9aa548263f3ff4e24adbe2c8250134d53222a7ef5d09e099fbd49f1fe452f275a3a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ucsmonograph.cls \
texlive-ucsmonograph"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-abntex2.cls \
tex-adjustbox.sty \
tex-amsmath.sty \
tex-calc.sty \
tex-caption.sty \
tex-chngcntr.sty \
tex-cite.sty \
tex-etoolbox.sty \
tex-float.sty \
tex-geometry.sty \
tex-glossaries-extra.sty \
tex-graphicx.sty \
tex-icomma.sty \
tex-ifluatex.sty \
tex-ifthen.sty \
tex-indentfirst.sty \
tex-kvoptions.sty \
tex-lmodern.sty \
tex-suffix.sty \
tex-textpos.sty \
tex-unicode-math.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
