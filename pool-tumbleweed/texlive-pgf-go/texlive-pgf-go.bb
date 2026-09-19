SUMMARY = "Diagramming and commenting on Go games"
DESCRIPTION = "A LaTeX package for creating Go (Baduk) diagrams with ease. It \
features an efficient coordinate-loading syntax to streamline \
workflows and offers flexible profile manipulation, allowing \
users to customize board layouts, stones, and annotations \
effortlessly."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2025.03.10svn78101"

RPM_NAME = "texlive-pgf-go-2026.226.0.0.2025.03.10svn78101-58.2.noarch.rpm"
RPM_HASH = "4cbfd6a1683b593c8755517dd32ac1449708f1c2626080f90819ba9ae2c9196afa8dcde1aa126579292055234387aedcb8bd21ebe9c0e6e63a1a57ba2aa71f53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pgf-go-coordinate-parser.sty \
tex-pgf-go-goban.sty \
tex-pgf-go-marks.sty \
tex-pgf-go-players.sty \
tex-pgf-go-profiles.sty \
tex-pgf-go-remember.sty \
tex-pgf-go-stones.sty \
tex-pgf-go.sty \
texlive-pgf-go"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pgf.sty \
tex-tikz.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
