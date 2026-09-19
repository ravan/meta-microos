SUMMARY = "Standard pages with n lines of at most m characters each"
DESCRIPTION = "For translations, proofreading, journal contributions etc. \
standard pages are used. Those standard pages consist of a \
fixed number of lines and characters per line. This package \
produces pages with n lines of at most m characters each. For \
instance the German 'Normseite': 60 lines of 30 characters \
each."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.6svn15878"

RPM_NAME = "texlive-stdpage-2026.226.0.0.6svn15878-64.2.noarch.rpm"
RPM_HASH = "9945246c6aac7c083b7dd0177c17631ede7b9203869a6ca539754233334502eaf2ee8a080bed33b14c2a373f04004cc950744771f0bc939272afd17fa6d756d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-stdpage.sty \
texlive-stdpage"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-hyphenat.sty \
tex-titlesec.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
