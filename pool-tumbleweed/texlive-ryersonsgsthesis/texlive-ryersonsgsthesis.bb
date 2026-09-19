SUMMARY = "Ryerson School of Graduate Studies thesis template"
DESCRIPTION = "This package provides a LaTeX class and template files for \
Ryerson School of Graduate Studies (SGS) theses."
LICENSE = "Apache-1.0"

PV = "2026.226.1.0.3svn50119"

RPM_NAME = "texlive-ryersonsgsthesis-2026.226.1.0.3svn50119-60.2.noarch.rpm"
RPM_HASH = "d49ce2e604094093beae0d25fc958ece595d1dc6c0b87b28c675a3e835784b4bacb5e1585a225bc2524ef4e569e232c78cdee8e51882d0b1fb197a4800362b3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ryersonSGSThesis.cls \
texlive-ryersonsgsthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-IEEEtrantools.sty \
tex-algorithm.sty \
tex-algorithmicx.sty \
tex-algpseudocode.sty \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-appendix.sty \
tex-array.sty \
tex-blindtext.sty \
tex-caption.sty \
tex-charter.sty \
tex-cite.sty \
tex-csquotes.sty \
tex-float.sty \
tex-geometry.sty \
tex-glossaries.sty \
tex-graphicx.sty \
tex-listings.sty \
tex-lmodern.sty \
tex-longtable.sty \
tex-makeidx.sty \
tex-ragged2e.sty \
tex-report.cls \
tex-sectsty.sty \
tex-setspace.sty \
tex-subcaption.sty \
tex-subfiles.sty \
tex-titlesec.sty \
tex-todonotes.sty \
tex-verbatim.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
