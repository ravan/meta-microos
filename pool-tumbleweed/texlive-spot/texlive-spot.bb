SUMMARY = "Spotlight highlighting for Beamer"
DESCRIPTION = "The package allows dramatic highlighting of words and phrases \
by painting shapes around them. It is chiefly intended for use \
in Beamer presentations, but it can be used in other document \
classes as well."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn22408"

RPM_NAME = "texlive-spot-2026.226.1.1svn22408-64.2.noarch.rpm"
RPM_HASH = "c89d46bc1f075e438466934b0e00dcdd8a03efa986e9c625d14313ed1a9d91efb5afed28f44abcfb39e3ed4f1a724e1c2672826e50b6a18c727d9ae0d0f998b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-spot.sty \
texlive-spot"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-afterpage.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
