SUMMARY = "Corporate Design for Bern University of Applied Sciences"
DESCRIPTION = "This bundle provides possibilities to use the Corporate Design \
of Bern University of Applied Sciences (BFH) with LaTeX. To \
this end it contains classes as well as some helper packages \
and config files together with some demo files."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2.6svn77879"

RPM_NAME = "texlive-bfh-ci-2026.226.2.2.6svn77879-61.2.noarch.rpm"
RPM_HASH = "7baa8d991577b8de35a2c4e52d1f0ed5941395d37cde8030a4d540ddb13ea6094f2b57f38a901c01f59b16a62bcee7875bf00e52c2f10c86dba0387806954180"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamercolorthemeBFH.sty \
tex-beamerfontthemeBFH.sty \
tex-beamerinnerthemeBFH.sty \
tex-beamerouterthemeBFH-sidebar.sty \
tex-beamerouterthemeBFH.sty \
tex-beamerthemeBFH.sty \
tex-bfh-a0paper.clo \
tex-bfh-a1paper.clo \
tex-bfh-a2paper.clo \
tex-bfh-a3paper.clo \
tex-bfh-a4paper.clo \
tex-bfh-a5paper.clo \
tex-bfh-a6paper.clo \
tex-bfh-beamerarticle.cfg \
tex-bfh-factsheet.cfg \
tex-bfh-layout-boxes.cfg \
tex-bfh-layout-listings.cfg \
tex-bfh-layout-rules.cfg \
tex-bfh-layout-tabular.cfg \
tex-bfh-layout-terminal.cfg \
tex-bfh-projectproposal.cfg \
tex-bfhbeamer.cls \
tex-bfhcolors.sty \
tex-bfhfonts.sty \
tex-bfhlayout.sty \
tex-bfhletter.sty \
tex-bfhlettersize9.5pt.clo \
tex-bfhmodule.sty \
tex-bfhpub.cls \
tex-bfhsciposter.cls \
tex-bfhthesis.cls \
texlive-bfh-ci"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-anyfontsize.sty \
tex-beamer.cls \
tex-expl3.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-handoutWithNotes.sty \
tex-hyperref.sty \
tex-iftex.sty \
tex-l3keys2e.sty \
tex-nunito.sty \
tex-qrcode.sty \
tex-scrartcl.cls \
tex-scrlayer-scrpage.sty \
tex-scrletter.sty \
tex-sourceserifpro.sty \
tex-tcolorbox.sty \
tex-tikz.sty \
tex-translations.sty \
tex-trimclip.sty \
tex-xcolor.sty \
tex-xparse.sty \
tex-zref.sty \
texlive \
texlive-adjustbox \
texlive-amsfonts \
texlive-amsmath \
texlive-anyfontsize \
texlive-beamer \
texlive-filesystem \
texlive-fontawesome \
texlive-fontspec \
texlive-geometry \
texlive-graphics \
texlive-handoutwithnotes \
texlive-hyperref \
texlive-iftex \
texlive-koma-script \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-l3kernel \
texlive-l3packages \
texlive-listings \
texlive-nunito \
texlive-pgf \
texlive-qrcode \
texlive-scripts \
texlive-scripts-bin \
texlive-sourceserifpro \
texlive-tcolorbox \
texlive-tools \
texlive-translations \
texlive-url \
texlive-xcolor \
texlive-zref"

inherit rpm
