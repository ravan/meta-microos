SUMMARY = "Adjust vertical space around lists"
DESCRIPTION = "This package modifies list environments such that they add \
\\parskip and \\partopsep before or after a list if and only if \
the environment follows or precedes, respectively, a blank line \
(i.e. a \\par)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn73155"

RPM_NAME = "texlive-listparskip-2026.226.1.0svn73155-61.2.noarch.rpm"
RPM_HASH = "587e11770cdda9818ab817eecbe12fd72de2d8a6749a807a389edee867e3f14bc7af4c5fb568f4034b9c58ada568b6b19107a522df7cbe590ffedb40032934ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-listparskip.sty \
texlive-listparskip"

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
