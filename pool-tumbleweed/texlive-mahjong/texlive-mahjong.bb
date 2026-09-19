SUMMARY = "Typeset Mahjong Tiles using MPSZ Notation"
DESCRIPTION = "The mahjong package provides a LaTeX2e and LaTeX3 interface for \
typesetting mahjong tiles using an extended version of MPSZ \
algebraic notation. Features include spaces, rotated, blank, \
and concealed tiles, as well as red fives. The size of the \
mahjong tiles can be controlled using a package option and an \
optional argument of \\mahjong. It is primarily aimed at Riichi \
(aka. Japanese) Mahjong but can be used to typeset any style of \
mahjong."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn76924"

RPM_NAME = "texlive-mahjong-2026.226.1.1svn76924-59.2.noarch.rpm"
RPM_HASH = "7bce63ef181a47f9901ac0c4404f152f08f502b86bc4989013ecdbff8faf72a0bd153f0c31c204d6d47ddbf2d88fc9e0ab7c074e74a2213010cabece7e775812"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mahjong.sty \
texlive-mahjong"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-graphicx.sty \
tex-l3keys2e.sty \
tex-stackengine.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
