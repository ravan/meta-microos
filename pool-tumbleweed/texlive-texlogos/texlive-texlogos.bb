SUMMARY = "Ready-to-use LaTeX logos"
DESCRIPTION = "TeXlogos defines an assortment of frequently used logos not \
contained in base LaTeX itself. The Metafont, MetapostAMS, \
BibTeX and SliTeX logos are defined, as long as you have the \
appropriate CM/Logo/AMS fonts. Currency symbols Euro, Cent, \
Yen, Won and Naira are defined so as not to need TS1-encoded \
fonts. Also defined are the C++ logo, with the '+' signs \
properly positioned, and the logo of the Vienna University \
Business Administration Center (BWZ)."
LICENSE = "LPPL-1.0"

PV = "2026.227.1.3.1svn19083"

RPM_NAME = "texlive-texlogos-2026.227.1.3.1svn19083-62.2.noarch.rpm"
RPM_HASH = "f6ca8ac3e4b77b0d60144f853911ac75b8b6112b6452c805f32316341128f4458ad0342d1af5fa4e6e5e2db7ad68566d6090877628103d2b7825566ef5eef942"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-texlogos.sty \
texlive-texlogos"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-graphics.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
