SUMMARY = "Reverse-counting enumerate environment"
DESCRIPTION = "The package implements the etaremune environment which is an \
enumerate environment in which the labels decrease instead of \
increasing. The package is noticeably more efficient than the \
revnum package, which uses painfully many counters."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn77682"

RPM_NAME = "texlive-etaremune-2026.226.1.2svn77682-59.2.noarch.rpm"
RPM_HASH = "55bc8dc31ced6ae0b201f1d2ebe829e80e1d8749c8e9501a3c399f55637c41095b31cdf98ad0bf7bb0423c8ab5b643cbd47da5c024ecd89911b897d9e457a8ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-etaremune.sty \
texlive-etaremune"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
