SUMMARY = "Typesetting Live Sequence Charts"
DESCRIPTION = "This package is similar to the msc package in that it provides \
macros for typesetting a variant of sequence diagrams, in this \
case the Live Sequence Charts of Damm and Harel. The package \
supports the full LSC language of the original LSC paper, the \
Klose-extensions for formal verification and some of the \
Harel-extensions for the Play-In/Play-Out approach (cf. the \
manual)."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-lsc-2026.226.svn15878-61.2.noarch.rpm"
RPM_HASH = "dae97c937acc7355b7165773c9eb178e717f15f1d4c83c8d953f4463c5408bcf590eb616349eaa53d93a26a6b591a9b8aa3e369e1a3057a27c75b6354106039e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lsc.sty \
texlive-lsc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-pst-node.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
