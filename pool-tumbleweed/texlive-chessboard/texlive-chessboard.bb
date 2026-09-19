SUMMARY = "Print chess boards"
DESCRIPTION = "This package offers commands to print chessboards. It can print \
partial boards, hide pieces and fields, color the boards and \
put various marks on the board. It has a lot of options to \
place pieces on the board. Using exotic pieces (e.g., for fairy \
chess) is possible. The documentation includes an example of an \
animated chessboard, for those whose PDF viewer can display \
animations."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn78101"

RPM_NAME = "texlive-chessboard-2026.226.2.0svn78101-60.2.noarch.rpm"
RPM_HASH = "9634d6f3813767d01aac32335d0c4134167b8a599c4a6aeb065f9dd2f004c2a9fc2f1d75c7f0ea9aae78f2d06497f83c8baae883e093d81ca553fd329ccac2be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-UF-chessboard-documentation.sty \
tex-chessboard-keys-main.sty \
tex-chessboard-keys-pgf.sty \
tex-chessboard-pgf.sty \
tex-chessboard.sty \
texlive-chessboard"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-animate.sty \
tex-array.sty \
tex-babel.sty \
tex-booktabs.sty \
tex-caption.sty \
tex-chessfss.sty \
tex-csquotes.sty \
tex-doc.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-fourier.sty \
tex-helvet.sty \
tex-ifluatex.sty \
tex-ifpdf.sty \
tex-makeidx.sty \
tex-microtype.sty \
tex-pst-node.sty \
tex-showexpl.sty \
tex-tikz.sty \
tex-xcolor.sty \
tex-xifthen.sty \
tex-xkeyval.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
