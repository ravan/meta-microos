SUMMARY = "A LaTeX class for Horizon Europe RIA and IA grant proposals"
DESCRIPTION = "This class facilitates the preparation of Research and \
Innovation Action (RIA) and Innovation Action (IA) funding \
proposals for the European Commission's Horizon Europe program. \
The class is a conversion of the official Part B template into \
LaTeX; it preserves the formatting and most of the instructions \
of the original version, and has the additional feature that \
tables (listing the participants, work packages, deliverables, \
etc.) are programmatically generated according to data supplied \
by the user."
LICENSE = "LPPL-1.0"

PV = "2026.226.4.0.1.0svn76077"

RPM_NAME = "texlive-heria-2026.226.4.0.1.0svn76077-60.4.noarch.rpm"
RPM_HASH = "29eb80531a39eb2d7fa016fc33afbc3264a1e3f3463877833ede9d9b564fd096dab9f523f40030f2765444e04f3942fa6183e75fd6b94f52070894478727f0c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-heria.cls \
tex-hi-annexes.tex \
tex-hi-capacity.tex \
tex-hi-criticalrisks.tex \
tex-hi-deliverables-key.tex \
tex-hi-deliverables.tex \
tex-hi-excellence.tex \
tex-hi-impact.tex \
tex-hi-inkind.tex \
tex-hi-measures.tex \
tex-hi-methodology.tex \
tex-hi-milestones.tex \
tex-hi-objectives.tex \
tex-hi-othercosts.tex \
tex-hi-participant-numbering.tex \
tex-hi-participants.tex \
tex-hi-pathways.tex \
tex-hi-purchasecosts.tex \
tex-hi-quality.tex \
tex-hi-staffeffort.tex \
tex-hi-subcontractingcosts.tex \
tex-hi-summary.tex \
tex-hi-tables.tex \
tex-hi-workplan.tex \
tex-hi-wp-description.tex \
tex-hi-wp-objectives.tex \
texlive-heria"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-atveryend.sty \
tex-colortbl.sty \
tex-enumitem.sty \
tex-environ.sty \
tex-fancyhdr.sty \
tex-fontenc.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-kvoptions.sty \
tex-lastpage.sty \
tex-makecell.sty \
tex-newtxmath.sty \
tex-newtxtext.sty \
tex-pdflscape.sty \
tex-tcolorbox.sty \
tex-titlesec.sty \
tex-twemojis.sty \
tex-ulem.sty \
tex-verbatim.sty \
tex-xcolor.sty \
tex-xfp.sty \
tex-xltabular.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
