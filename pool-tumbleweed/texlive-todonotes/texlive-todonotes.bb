SUMMARY = "Marking things to do in a LaTeX document"
DESCRIPTION = "The package lets the user mark things to do later, in a simple \
and visually appealing way. The package takes several options \
to enable customization/finetuning of the visual appearance."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.7svn77682"

RPM_NAME = "texlive-todonotes-2026.226.1.1.7svn77682-59.2.noarch.rpm"
RPM_HASH = "f7a6d62c1459cec45f02a26cb15a053f0cb2973725edc44b6c372af737cf8b8d516e93e52b05e4b1521b921afb37b34aaecebaaf04ee30b00e4f0a2a58090f27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-todonotes.sty \
texlive-todonotes"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-ifthen.sty \
tex-tikz.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pgf \
texlive-scripts \
texlive-scripts-bin \
texlive-tools \
texlive-xcolor \
texlive-xkeyval"

inherit rpm
