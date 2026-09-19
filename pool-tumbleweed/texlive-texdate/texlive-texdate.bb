SUMMARY = "Date printing, formatting, and manipulation in TeX"
DESCRIPTION = "TeX and LaTeX provide few facilities for dates by default, \
though many packages have filled this gap. This package fills \
it, as well, with a pure TeX-primitive implementation. It can \
print dates, advance them by numbers of days, weeks, or months, \
determine the weekday automatically (with an algorithm cribbed \
from the dayofweek.tex file written by Martin Minow), and print \
them in (mostly) arbitrary format. It can also print calendars \
(monthly and yearly) automatically, and can be easily localized \
for non-English languages."
LICENSE = "LPPL-1.0"

PV = "2026.227.2.0svn49362"

RPM_NAME = "texlive-texdate-2026.227.2.0svn49362-62.2.noarch.rpm"
RPM_HASH = "41d666178074fa3dd664827fcb94ed9ceb930ef5fed66f680d874ed3e50fec459b83772a3f2ded3ef2a2289acef095624406a251ecfc1d216a188097ef4b0723"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-texdate.sty \
texlive-texdate"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iflang.sty \
tex-modulus.sty \
tex-padcount.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
