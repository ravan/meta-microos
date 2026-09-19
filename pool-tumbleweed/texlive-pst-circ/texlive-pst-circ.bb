SUMMARY = "PSTricks package for drawing electric circuits"
DESCRIPTION = "The package is built using PSTricks and in particular pst-node. \
It can easily draw current 2-terminal devices and some 3- and \
4-terminal devices used in electronic or electric theory. The \
package's macros are designed with a view to 'logical' \
representation of circuits, as far as possible, so as to \
relieve the user of purely graphical considerations when \
expressing a circuit."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.20svn72519"

RPM_NAME = "texlive-pst-circ-2026.226.2.20svn72519-59.2.noarch.rpm"
RPM_HASH = "30dd32b675888fefda4da31ea44cf0fc4d625ecb92365bd9fe5de10dc763833807008b52587536a273e6e72807ec47c043310a181d782162e8e1a2979492bae6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-circ.sty \
tex-pst-circ.tex \
texlive-pst-circ"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
