SUMMARY = "Drawing sparklines: intense, simple, wordlike graphics"
DESCRIPTION = "Sparklines are intense, simple, wordlike graphics (so named by \
Edward Tufte). In lieu of a more detailed introduction, \
Professor Tufte's site has an early release of a chapter on \
sparklines. A PHP implementation may be found at SourceForge. A \
sparkline can be added using the sparkline environment. Also, \
you can add sparkling rectangles for the median and special \
sparkling dots in red or blue. The package requires pdfLaTeX; \
sparklines cannot appear in a dvi file. The sparklines package \
uses pgf, and does not work with pictex."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.7svn42821"

RPM_NAME = "texlive-sparklines-2026.226.1.7svn42821-64.2.noarch.rpm"
RPM_HASH = "cbfcf122decb7a6252c7d52888bd521a97148877be343f467a1c245fe692d420e88b35452090719ab24c1840edb84d96c769d198239570a1444e85b7d39cfa26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sparklines.sty \
texlive-sparklines"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pgf.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
