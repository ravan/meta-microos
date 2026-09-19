SUMMARY = "Xkcd names of colors"
DESCRIPTION = "In the year 2010, Randall Munroe on posted a really funny and \
nice article on xkcd. He made a very curious experiment: \
showing colors to a lot of people and asking to name each one. \
Afterward, he processed the data and sorted the names for each \
color by popularity -- that means, how many people gave the \
same name to the same color. This package makes the collected \
color names usable with LaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.2svn67895"

RPM_NAME = "texlive-xkcdcolors-2026.226.1.0.2svn67895-59.4.noarch.rpm"
RPM_HASH = "e7a2d9e551604d496f48a57ab1ba187466673efa0a7f503e4c85146614a5f3a04708898df824ba58b888872670f29e13d023c77c6d740ebfff2870d7743385a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xkcdcolors.sty \
texlive-xkcdcolors"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
