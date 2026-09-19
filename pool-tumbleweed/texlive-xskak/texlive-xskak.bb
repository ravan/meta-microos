SUMMARY = "An extension to the skak package for chess typesetting"
DESCRIPTION = "Xskak, as its prime function, saves information about a chess \
game for later use (e.g., to loop through a game to make an \
animated board). The package also extends the input that the \
parsing commands can handle and offers an interface to define \
and switch between indefinite levels of styles."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn78101"

RPM_NAME = "texlive-xskak-2026.226.1.5svn78101-59.4.noarch.rpm"
RPM_HASH = "d68a93758290a334c1a5e28b958ee49b23c3e77a09a6e390f69a9e808f3184ab0d3a0f54f12a96fed168ab587ea9ab1962194a248cba5692a1468f0640d1ccd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xskak-keys.sty \
tex-xskak-nagdef.sty \
tex-xskak.sty \
texlive-xskak"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-chessboard.sty \
tex-etoolbox.sty \
tex-xifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
