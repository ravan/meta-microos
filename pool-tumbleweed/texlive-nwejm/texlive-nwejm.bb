SUMMARY = "Support for the journal 'North-Western European Journal of Mathematics'"
DESCRIPTION = "The bundle includes LaTeX classes and BibLaTeX styles files \
dedicated to the new journal 'North-Western European Journal of \
Mathematics': nwejm for the complete issues of the journal, \
aimed at the NWEJM's team, nwejmart, intended for the authors \
who wish to publish an article in the NWEJM. This class's goal \
is to: faithfully reproduce the layout of the nwejm, thus \
enabling the authors to be able to work their document in \
actual conditions, provide a number of tools (commands and \
environments) to facilitate the drafting of documents, in \
particular those containing mathematical formulas."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn77980"

RPM_NAME = "texlive-nwejm-2026.226.2.1svn77980-61.2.noarch.rpm"
RPM_HASH = "9b7830acdd9639eae71deb8175882269be27c67b6c0ce6047c54ed15ac11f3f9e9289bfb5d70085fc47369ddf31fe84fd458bfc1e8a0a8ee2b6f811db6344156"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nwejm-2024-02-08.cls \
tex-nwejm.bbx \
tex-nwejm.cbx \
tex-nwejm.cfg \
tex-nwejm.cls \
tex-nwejm.lbx \
tex-nwejmart.cls \
texlive-nwejm"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-adjustbox.sty \
tex-afterpage.sty \
tex-array.sty \
tex-authoryear-comp.bbx \
tex-authoryear-comp.cbx \
tex-babel.sty \
tex-biblatex.sty \
tex-bookmark.sty \
tex-booktabs.sty \
tex-cleveref.sty \
tex-csquotes.sty \
tex-currfile.sty \
tex-datatool.sty \
tex-datetime2.sty \
tex-draftwatermark.sty \
tex-enumitem.sty \
tex-environ.sty \
tex-esvect.sty \
tex-etoc.sty \
tex-etoolbox.sty \
tex-fmtcount.sty \
tex-fontenc.sty \
tex-footmisc.sty \
tex-footnote.sty \
tex-geometry.sty \
tex-glossaries.sty \
tex-graphicx.sty \
tex-hypcap.sty \
tex-hyperref.sty \
tex-ifoddpage.sty \
tex-import.sty \
tex-keytheorems.sty \
tex-kpfonts-otf.sty \
tex-kpfonts.sty \
tex-listings.sty \
tex-marginnote.sty \
tex-mathtools.sty \
tex-microtype.sty \
tex-nag.sty \
tex-ntheorem.sty \
tex-placeins.sty \
tex-refcount.sty \
tex-standalone.sty \
tex-subcaption.sty \
tex-tcolorbox.sty \
tex-tikzpagenodes.sty \
tex-titlesec.sty \
tex-tkz-berge.sty \
tex-tocloft.sty \
tex-tocvsec2.sty \
tex-translations.sty \
tex-unicode-math.sty \
tex-varioref.sty \
tex-xcolor.sty \
tex-xr.sty \
tex-xspace.sty \
tex-zref-clever.sty \
tex-zref-totpages.sty \
tex-zref-vario.sty \
tex-zref-xr.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
