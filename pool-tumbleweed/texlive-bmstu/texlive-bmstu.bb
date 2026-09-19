SUMMARY = "A LaTeX class for Bauman Moscow State Technical University"
DESCRIPTION = "The class defines commands and environments for creating \
reports and explanatory notes in Bauman Moscow State Technical \
University (Russia). Klass opredeliaet komandy i okruzheniia \
dlia sozdaniia otchetov i raschetno-poiasnitel'nykh zapisok v \
MGTU im. N. E. Baumana. Sgenerirovannye faily sootvetstvuiut \
trebovaniiam MGTU im. N. E. Baumanai GOST 7.32-2017. \
Raschetno-poiasnitel'nye zapiski k vypusknym kvalifikatsionnym \
rabotam uspeshno prokhodiat proverku TestVKR (sborka 203)."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0.0svn65897"

RPM_NAME = "texlive-bmstu-2026.226.2.0.0svn65897-59.2.noarch.rpm"
RPM_HASH = "566ead141df9f27fe31c69efe24b81fce1de47a0c524ae704f900613ba6f9c1f458d8cdcbbdc1d113c99a75d24269858b8d721862f22a6840477ae9463c50cab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bmstu-appendix.sty \
tex-bmstu-biblio.sty \
tex-bmstu-defabbr.sty \
tex-bmstu-essay.sty \
tex-bmstu-figure.sty \
tex-bmstu-listing.sty \
tex-bmstu-title.sty \
tex-bmstu-toc.sty \
tex-bmstu.cls \
texlive-bmstu"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-afterpage.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-assoccnt.sty \
tex-babel.sty \
tex-booktabs.sty \
tex-csquotes.sty \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-extreport.cls \
tex-fix-cm.sty \
tex-float.sty \
tex-fontenc.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-indentfirst.sty \
tex-inputenc.sty \
tex-lastpage.sty \
tex-listings.sty \
tex-listingsutf8.sty \
tex-lscape.sty \
tex-microtype.sty \
tex-pgffor.sty \
tex-pgfplots.sty \
tex-setspace.sty \
tex-stackengine.sty \
tex-tabularx.sty \
tex-tikzscale.sty \
tex-titlesec.sty \
tex-totcount.sty \
tex-ulem.sty \
tex-wrapfig.sty \
tex-xcolor.sty \
tex-xifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
