SUMMARY = "LaTeX templates of Technische Universitat Darmstadt"
DESCRIPTION = "The TUDa-CI-Bundle provides a possibility to use the Corporate \
Design of TU Darmstadt in LaTeX. It contains documentclasses as \
well as some helper packages and config files together with \
some templates for user documentation, which currently are only \
available in German."
LICENSE = "LPPL-1.0"

PV = "2026.226.4.05svn76863"

RPM_NAME = "texlive-tuda-ci-2026.226.4.05svn76863-59.2.noarch.rpm"
RPM_HASH = "10d3950628c65cbdf85a258d6921e6583fd6ece1a4ecae043230f66d1b97fce695a8869c2f2827ada31a5239cdc6b0d50c4fabad01030f46668b46d93f354267"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamercolorthemeTUDa.sty \
tex-beamercolorthemeTUDa2008.sty \
tex-beamerfontthemeTUDa.sty \
tex-beamerfontthemeTUDa2008.sty \
tex-beamerinnerthemeTUDa.sty \
tex-beamerinnerthemeTUDa2008.sty \
tex-beamerinnerthemeTUDa2023.sty \
tex-beamerouterthemeTUDa.sty \
tex-beamerouterthemeTUDa2008.sty \
tex-beamerthemeTUDa-mecheng.sty \
tex-beamerthemeTUDa.sty \
tex-beamerthemeTUDa2008.sty \
tex-beamerthemeTUDa2023.sty \
tex-tuda-a0paper.clo \
tex-tuda-a1paper.clo \
tex-tuda-a2paper.clo \
tex-tuda-a3paper.clo \
tex-tuda-a4paper.clo \
tex-tuda-a5paper.clo \
tex-tuda-pgfplots.sty \
tex-tudabeamer.cls \
tex-tudacolors.def \
tex-tudacolors.sty \
tex-tudaexercise.cls \
tex-tudafonts.sty \
tex-tudaleaflet.cls \
tex-tudaletter.cls \
tex-tudalettersize10pt.clo \
tex-tudamecheng.cfg \
tex-tudaposter.cls \
tex-tudapub.cls \
tex-tudarules.sty \
tex-tudasciposter.cls \
tex-tudasize9pt.clo \
tex-tudathesis.cfg \
texlive-tuda-ci"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-URspecialopts.sty \
tex-XCharter.sty \
tex-afterpage.sty \
tex-anyfontsize.sty \
tex-beamer.cls \
tex-bookmark.sty \
tex-fontspec.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-iftex.sty \
tex-inputenc.sty \
tex-leaflet.cls \
tex-luainputenc.sty \
tex-microtype.sty \
tex-multicol.sty \
tex-pdfx.sty \
tex-pgf.sty \
tex-pgfplots.sty \
tex-qrcode.sty \
tex-ragged2e.sty \
tex-roboto-mono.sty \
tex-roboto.sty \
tex-scrartcl.cls \
tex-scrextend.sty \
tex-scrlayer-notecolumn.sty \
tex-scrlayer-scrpage.sty \
tex-scrlayer.sty \
tex-scrletter.cls \
tex-tcolorbox.sty \
tex-textcomp.sty \
tex-tikz.sty \
tex-trimclip.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
