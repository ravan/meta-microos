SUMMARY = "Use Twitter's open source emojis through LaTeX commands"
DESCRIPTION = "This package provides a simple wrapper which allows to use \
Twitter's open source emojis through LaTeX commands. This \
relies on images, so no fancy unicode-font stuff is needed and \
it should work on every installation."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3.1_twemoji_v14.0.1svn77682"

RPM_NAME = "texlive-twemojis-2026.226.1.3.1_twemoji_v14.0.1svn77682-59.2.noarch.rpm"
RPM_HASH = "6250f5de86eb2d6e29510c23794b8a2f3c2f2a297ffa5389a62c3855717c881920c94f883def6defca8739a5fdc15cf617e82843caf0f90cce3d90692ba89d6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-twemojis.sty \
texlive-twemojis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
