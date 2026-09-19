SUMMARY = "Collection of LaTeX classes, style files and example documents for academic manuscripts"
DESCRIPTION = "This is a collection of modern LaTeX classes, style files and \
example documents for authoring Bachelor, Master, Diploma, or \
PhD theses and related academic manuscripts in English and \
German. Pre-configured English and German documents are \
available. They are easy to use even for LaTeX beginners, and \
compatible with LaTeX distributions for Windows, macOS, and \
Linux. The document classes are immediately usable and \
convenient to customize."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn74272"

RPM_NAME = "texlive-hagenberg-thesis-2026.226.svn74272-60.4.noarch.rpm"
RPM_HASH = "2099ea1aac6cae98b8969e07d16999d3b1ddac3bc98128eb0c476e40307c4e647d5ab9a845511367aee2a8f71cf136fc56eb03a1800b46fa78df2b94bcef2381"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hgb.sty \
tex-hgbabbrev.sty \
tex-hgbalgo.sty \
tex-hgbarticle.cls \
tex-hgbbib.sty \
tex-hgbdict.sty \
tex-hgbheadings.sty \
tex-hgblistings.sty \
tex-hgbmath.sty \
tex-hgbpdfa.sty \
tex-hgbreport.cls \
tex-hgbtheme-custom.sty \
tex-hgbtheme-default.sty \
tex-hgbtheme-fhooe24.sty \
tex-hgbthesis.cls \
texlive-hagenberg-thesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-abstract.sty \
tex-algorithm.sty \
tex-algpseudocodex.sty \
tex-amsbsy.sty \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-article.cls \
tex-babel.sty \
tex-biblatex.sty \
tex-book.cls \
tex-booktabs.sty \
tex-breakurl.sty \
tex-calc.sty \
tex-caption.sty \
tex-cmap.sty \
tex-csquotes.sty \
tex-datetime2.sty \
tex-enumitem.sty \
tex-epstopdf.sty \
tex-exscale.sty \
tex-extramarks.sty \
tex-fancyhdr.sty \
tex-float.sty \
tex-fontenc.sty \
tex-forloop.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hypcap.sty \
tex-hyperref.sty \
tex-ifpdf.sty \
tex-inputenc.sty \
tex-lengthconvert.sty \
tex-lineno.sty \
tex-listingsutf8.sty \
tex-lmodern.sty \
tex-longtable.sty \
tex-marvosym.sty \
tex-moreverb.sty \
tex-multirow.sty \
tex-overpic.sty \
tex-pdfmanagement-testphase.sty \
tex-pdfpages.sty \
tex-pict2e.sty \
tex-report.cls \
tex-soul.sty \
tex-subdepth.sty \
tex-textcomp.sty \
tex-textpos.sty \
tex-tikz.sty \
tex-titlesec.sty \
tex-titling.sty \
tex-tocbasic.sty \
tex-upquote.sty \
tex-url.sty \
tex-verbatim.sty \
tex-xcolor.sty \
tex-xifthen.sty \
tex-xspace.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
