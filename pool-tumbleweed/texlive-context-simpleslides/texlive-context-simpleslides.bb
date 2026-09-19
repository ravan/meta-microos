SUMMARY = "A module for preparing presentations"
DESCRIPTION = "This ConTeXt module provides an easy-to-use interface for \
creating presentations for use with a digital projector. The \
presentations are not interactive (no buttons, hyperlinks or \
navigational tools such as tables of contents). Graphics may be \
mixed with the text of slides. The module provides several \
predefined styles, designed for academic presentation. Most \
styles are configurable, and it is easy to design new styles."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn67070"

RPM_NAME = "texlive-context-simpleslides-2026.226.svn67070-61.2.noarch.rpm"
RPM_HASH = "45f62c8de2334549eae7dc9abfd727f92c0aca719b516b4cd4b957681b9ebe1af5fe9ffd193075a773a4fc90dd930a15586dd3d532229695de10bd70e363021e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-s-simpleslides-BigNumber.tex \
tex-s-simpleslides-BlackBoard.tex \
tex-s-simpleslides-BottomSquares.tex \
tex-s-simpleslides-Boxed.tex \
tex-s-simpleslides-BoxedTitle.tex \
tex-s-simpleslides-Ellipse.tex \
tex-s-simpleslides-Embossed.tex \
tex-s-simpleslides-Framed.tex \
tex-s-simpleslides-FramedTitle.tex \
tex-s-simpleslides-FuzzyFrame.tex \
tex-s-simpleslides-FuzzyTopic.tex \
tex-s-simpleslides-HorizontalStripes.tex \
tex-s-simpleslides-NarrowStripes.tex \
tex-s-simpleslides-PlainCounter.tex \
tex-s-simpleslides-RainbowStripe.tex \
tex-s-simpleslides-Rounded.tex \
tex-s-simpleslides-Shaded.tex \
tex-s-simpleslides-SideSquares.tex \
tex-s-simpleslides-SideToc.tex \
tex-s-simpleslides-Split.tex \
tex-s-simpleslides-Sunrise.tex \
tex-s-simpleslides-Swoosh.tex \
tex-s-simpleslides-ThickStripes.tex \
tex-s-simpleslides-default.tex \
texlive-context-simpleslides"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-context \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
