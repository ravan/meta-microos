SUMMARY = "Extend list of predefined colour names for MetaPost"
DESCRIPTION = "The MetaPost format plain.mp provides only five built-in colour \
names (variables), all of which are defined in the RGB model: \
red, green and blue for the primary colours and black and \
white. The package makes more than 500 colour names from \
different colour sets in different colour models available to \
MetaPost. Colour sets include X11, SVG, DVIPS and xcolor \
specifications."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.20svn23252"

RPM_NAME = "texlive-mpcolornames-2026.226.0.0.20svn23252-61.2.noarch.rpm"
RPM_HASH = "9c433509470eee102373ea32f4b2e27826a1552da5953c6f71b1606753c5594774d17c124fad57080aa76747d4f6c6075dc0ed5e48d2521511445622a014399f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mpcolornames"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
